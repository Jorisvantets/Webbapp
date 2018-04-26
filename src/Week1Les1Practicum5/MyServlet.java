package Week1Les1Practicum5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServlet extends Thread {
	private Socket socket;

	public MyServlet(Socket sock) {
		socket = sock;

	}

	public void run() {
		try {
			InputStream is = socket.getInputStream();
			Scanner sc = new Scanner(is);

			OutputStream os = socket.getOutputStream();
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
			Thread.sleep(10000);
			socket.close();
			sc.close();
		}

		catch (IOException | InterruptedException e) {
		}

	}

}
