package Week1Les1Practicum2;

//
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.io.InputStream;
//import java.util.Scanner;
//
//class Server {
//public static void main(String[] arg) throws Exception {
//  ServerSocket ss = new ServerSocket(4711);
//  Socket s = ss.accept();
//  InputStream is = s.getInputStream();
//  Scanner sc = new Scanner(is);
//  sc.hasNextLine();
//  sc.nextLine();
//
//  
//  int c = is.read();
//  while (c != -1) {
//    System.out.print((char) c);
//    c = is.read();
//  } 
//  sc.close();
//  s.close();
//  ss.close();
//  
//}
//}

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStream;

class Server {
public static void main(String[] arg) throws Exception {
	  while (true) {
  ServerSocket ss = new ServerSocket(4712);
  Socket s = ss.accept();
  InputStream is = s.getInputStream();
  Scanner sc = new Scanner(is);
  
  if (sc.hasNextLine()) {
  	System.out.print(sc.nextLine());
  }
 
  sc.close();
  s.close();
  ss.close();
}
}
}