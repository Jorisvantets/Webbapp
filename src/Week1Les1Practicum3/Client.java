package Week1Les1Practicum3;

import java.net.Socket;
import java.util.Scanner;
import java.io.OutputStream;
import java.io.PrintWriter;

class Client {
	public static void main(String[] arg) throws Exception {
		Socket s = new Socket("145.89.161.134", 4712);
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			pw.println(sc.nextLine());
			pw.flush();
		}
		sc.close();
		pw.close();
		s.close();

	}
}
