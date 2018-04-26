package Week1Les1Practicum3;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.util.Scanner;

class Server {
	public static void main(String[] arg) throws Exception {
		while (true) {
			ServerSocket ss = new ServerSocket(4712);
			Socket s = ss.accept();
			InputStream is = s.getInputStream();

			Scanner sc = new Scanner(is);
			while (sc.hasNextLine()) {
				System.out.print(sc.nextLine());
			}

			sc.close();
			s.close();
			ss.close();
		}
	}
}