package tpsocketClientServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static final int PORT = 6000;
    public static void main(String[] args) throws IOException {
	ServerSocket s = new ServerSocket(PORT);
	try 
	{  // Le programme s'arrête  ici et attend une demande de connexion:
	     Socket socket = s.accept();
	     try 
	     {
                BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(new BufferedWriter( new OutputStreamWriter(socket.getOutputStream())),true);
                String str = in.readLine();
                System.out.println("Reçu: " + str);
                out.println(" Bien reçu   " + str);
         }
	     finally
	     {
             socket.close();   
         }
    } 
	finally 
	{
         s.close(); 
    }
  }

}
