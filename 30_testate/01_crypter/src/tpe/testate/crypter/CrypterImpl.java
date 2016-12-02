package tpe.testate.crypter;

/**
 * Die Klasse implemetiert das Interface Crypter und ist für die Verschlüsselung
 * und Entschlüsselung von Texten zuständig
 *
 * @author Stella Neser
 *
 */
public class CrypterImpl implements Crypter {
	/**
	 * Verschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben, so
	 * werden diese in Kleinbuchstaben umgewandelt. Ungültige Zeichen werden
	 * ignoriert und nicht in den verschlüsselten Text übernommen.
	 *
	 * @param input
	 *            Text, der verschlüsselt werden soll.
	 * @return Verschlüsselter Text.
	 */
	@Override
	public String encrypt(String input) {
		String encrypted = "";
		input = input.toLowerCase(); // nur kleinbuchstaben erlaubt
		for (int i = 0; i < input.length(); i++) {
			if (isValid(input.charAt(i))) {
				encrypted += encode(input.charAt(i));
			}
		}
		return encrypted;
	}

	/**
	 * Entschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
	 * oder andere ungültige Zeichen, so wirft die Methode eine Ausnahme.
	 *
	 * @param input
	 *            Text, der entschlüsselt werden soll.
	 * @return Entschlüsselter Text.
	 * @throws IllegalArgumentException
	 *             Wird geworfen, wenn die Eingabe ungültige Zeichen
	 *             (Großbuchstaben) enthält.
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		String decrypted = "";
		for (int i = 0; i < input.length(); i++) {

			if (isValid(input.charAt(i))) {
				decrypted += encode(input.charAt(i));
			} else {
				throw new IllegalArgumentException();
			}
		}
		return decrypted;
	}

	/**
	 * Prüft Zeichen auf Gültigkeit
	 *
	 * @param input das zu untersuchende Zeichen
	 * @return True wenn gültiges zeichen, False wenn nicht
	 */
	private boolean isValid(char input) {
		return ((input >= 'a' && input <= 'z') || (input >= '0' && input <= '9') || input == ' ');
	}

	/**
	 * Bestimmte zeichen werden hier durch andere erstezt (verschlüsselt)
	 *
	 * @param input das zu verschlüsselnde Zeichen
	 * @return gibt die Verschlüsselung der bestimmten Zeichen zurueck
	 */
	private char encode(char input) {
		switch (input) {
		case 'e':
			return '3';
		case '3':
			return 'e';
		case 'l':
			return '1';
		case '1':
			return 'l';
		case 'o':
			return '0';
		case '0':
			return 'o';
		case 'a':
			return '4';
		case '4':
			return 'a';
		case 't':
			return '7';
		case '7':
			return 't';
		default:
			return input;
		}
	}
}
