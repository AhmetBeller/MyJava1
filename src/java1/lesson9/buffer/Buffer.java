package java1.lesson9.buffer;

public class Buffer {

	public static void main(String[] args) {
		// Aufgabe StringBuffer:
		String text = "";
		for (int i = 0; i <= 99; i++) {
			text += "Luftballon " + i + "\n";
		}
		// System.out.println(text);

		// Lösung StringBuffer:
		StringBuffer textBuf = new StringBuffer("");
		for (int i = 0; i <= 99; i++) {
			textBuf.append("Luftballon " + i + "\n");
		}
		System.out.println(textBuf);

	}

}
