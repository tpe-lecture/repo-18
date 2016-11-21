package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {
		String encrypted = "";
		input = input.toLowerCase(); // nur kleinbuchstaben erlaubt
		for (int i = 0; i < input.length(); i++) {
			encrypted += encode(input.charAt(i));
		}
		return encrypted;
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		String decrypted = "";
		for (int i = 0; i < input.length(); i++) {

			if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= '0' && input.charAt(i) <= '9')
					|| input.charAt(i) == ' ') {
				decrypted += encode(input.charAt(i));
			} else {
				throw new IllegalArgumentException();
			}
		}
		return decrypted;
	}

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
