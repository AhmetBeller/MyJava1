package java1.lesson9.pakete;

import java.io.*;
import java.net.*;

import java1.lesson9.pakete.Client;
import java1.lesson9.pakete.Utilities;
//oder
//import mygame.client.*;
//import mygame.shared.*;

public class Server {
 
    public static void main(String args[]) {
        ServerSocket serverSocket = null;
 
        Utilities.printMsg("creating server socket");
     
        try {
            serverSocket = new ServerSocket(5555); // mit 4444 geht es nicht. // CMD offene Ports --> netstat -a -b -o
        } catch (IOException e) {
            System.err.println("Unable to create server socket, " + e);
            System.exit(1);
        }
 
        Utilities.printMsg("accepting client connections");
 
        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                new Client(clientSocket).start();
            } catch (IOException e) {
                System.err.println("Unable to accept socket connection, " + e); 
                System.exit(1);
            }
        }
    }
}
