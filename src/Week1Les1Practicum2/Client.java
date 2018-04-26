package Week1Les1Practicum2;
import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;

class Client {
  public static void main(String[] arg) throws Exception {
    Socket s = new Socket("145.89.161.134", 4711);
    OutputStream os = s.getOutputStream();
    PrintWriter pw = new PrintWriter(os);
	pw.println(" hoi ");
	pw.flush();
	pw.close();
    s.close();

    
  }
}
