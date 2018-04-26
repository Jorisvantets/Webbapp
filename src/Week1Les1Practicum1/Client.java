package Week1Les1Practicum1;

import java.net.Socket;
import java.io.OutputStream;

class Client {

	public static void main(String[] arg) throws Exception {
		Socket s = new Socket("145.89.107.63", 4711);
		OutputStream os = s.getOutputStream();
		os.write("dawg\n".getBytes());
		s.close();

	}
}
