package recursividad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
	
	// usados para la generaci?n aleatoria
	private final char[] LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
	private final char[] Characters = "0123456789:+-*/?¿$%&#@!¡<>".toCharArray();
	private Random r;
	
	
	/**
	 * Indica si debe generarse un digito o una letra
	 *
	 */
	public enum CharType {
		characters, LETTER;
	}
	
	/**
	 * Constructor del generador de contrase?as
	 */
	public PasswordGenerator() {
		r = new Random();
	}
	
	/**
	 * Genera una letra aletoria
	 * @return letra aleatoria generada
	 */
	private char getRandomLetter() {
		return LETTERS[r.nextInt(LETTERS.length)];
	}
	
	/**
	 * Genera un digito aleatorio
	 * @return digito aleatorio generado
	 */
	private char getRandomDigit() {
		return Characters[r.nextInt(Characters.length)];
	}

	/**
	 * Genera un orden de prueba aleatorio 
	 * @return lista que contiene el orden en el que probar (DIGIT, LETTER) o (LETTER, DIGIT)
	 */
	private List<CharType> getRandomOrder() {
		List<CharType> generationOrder = Arrays.asList(CharType.values());
		Collections.shuffle(generationOrder, r);
		return generationOrder;
	}
	
	private boolean holdsConditions(int length, int numCharacters, int numLetters, int size, int minCharacters, int minLetters) {
		int remainingChars = size - length;
		return minCharacters - numCharacters <= remainingChars &&
			minLetters - numLetters <= remainingChars;
	}
	
	// - Si se cumplen las condiciones:
	// 		- Si se ha alcanzado la longitud deseada devolver el string (vac?o)
	//		- Si no se ha alcanzado la longitud deseada:
	//  		- Generar una secuencia de prueba aleatoria (utilizando el m?todo) getRandomOrder y probar/iterar sobre las distintas posibilidades (DIGIT, LETTER).
	//			- Si la posibilidad probada ha devuelto null, se sabe que ese camino es incorrecto.
	//			- Si la posibilidad probada ha devuelto una cadena v?lida (distinta de null), concatenarla a un caracter aleatorio del tipo correspondiente y devolverla.
	// - Si no se cumplen las condiciones devolver null
	private String generateRec(int length, int numCharacters, int numLetters, int size, int minCharacters, int minLetters) {
		// TODO T5. Implementar recursividad
		if (holdsConditions(length, numCharacters, numLetters, size, minCharacters, minLetters)) {
			if (length == size) 
				return "";
			
			String password = null;
			char randomChar = 0;
			
			for (CharType charType : getRandomOrder()) {
				switch (charType) {
					case characters:	password = generateRec(length + 1, numCharacters + 1, numLetters, size, minCharacters, minLetters);
								randomChar = getRandomDigit();
								break;
								
					case LETTER:password = generateRec(length + 1, numCharacters, numLetters + 1, size, minCharacters, minLetters);
								randomChar = getRandomLetter();
								break;
				}
			
				if (password != null) 
					return randomChar + password;
			}
		}
		
		return null; 
	}

	public String generate(int size, int minCharacters, int minLetters) {
		if (minCharacters + minLetters > size)
			throw new IllegalArgumentException(
				String.format("Incompatible restrictions. minDigits (%d) + minLetters (%d) cannot be greater than size (%d)", 
					minCharacters, minLetters, size)
			);
			
		return generateRec(0, 0, 0, size, minCharacters, minLetters);
	}
	
	public static void main(String args[]) {
		System.out.println( "Generando 4 contraseñas distintas de longitud 10 con 3 dígitos y 3 letras como mínimo:" );
        PasswordGenerator p = new PasswordGenerator();
        
        System.out.println(p.generate(10, 3, 3));
        System.out.println(p.generate(10, 3, 3));

        
	}
}
