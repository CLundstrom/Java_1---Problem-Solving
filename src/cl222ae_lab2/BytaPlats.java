package cl222ae_lab2;

public class BytaPlats {

	public static void main(String[] args) {
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D' };
		System.out.println(text);

		char buf = ' ';

		for (int i = 0; i < (text.length) / 2; i++) {

			buf = text[i]; // temporary char buffer

			text[i] = text[(text.length - 1) - i];
			text[(text.length - 1) - i] = buf;
		}

		System.out.println(text);
	}

}
