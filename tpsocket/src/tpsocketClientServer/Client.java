package tpsocketClientServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		InetAddress addr = InetAddress.getByName("YASSALIE-PC");       
	       Socket socket = new Socket(addr, 6000);
	       try 
	       {  
		    BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream()));
		    PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter (socket.getOutputStream())),true);
		    out.println("Bonjour");
		    String str = in.readLine();
		    System.out.println(str);
	      } 
	      finally
	      {
	            socket.close();
	      } 
	}

}
