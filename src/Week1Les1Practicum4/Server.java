package Week1Les1Practicum4;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Server {
	public static void main(String[] arg) throws Exception {
		while (true) {
			ServerSocket ss = new ServerSocket(4711);
			Socket s = ss.accept();
			InputStream is = s.getInputStream();

			Scanner sc = new Scanner(is);
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				if (sc.nextLine().isEmpty()) {
					break;
				}
			}
			pw.println("HTTP/1.1 200 OK \r\n");
			pw.println("<h1>It works!</h1>");
			pw.flush();	

			sc.close();
			s.close();
			ss.close();
		}
	}
}