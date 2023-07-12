import java.net.*;

import java.io.*;

public class SimpleServer {

public static void main(String args[]) throws IOException {

// Register service on port 1254
ServerSocket s = new ServerSocket (1254);
Socket sl=s.accept(); // Wait and accept a connection
// Get a communication stream associated with the socket
OutputStream slout = sl.getOutputStream() ;
DataOutputStream dos = new DataOutputStream (slout);
// Send a string!
dos .writeUTF("Hi there");
// Close the connection, but not the server socket
dos.close();
slout.close();
sl.close();
}
}
