/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alampi.adrian
 */
public class Serverino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            ServerSocket server=new ServerSocket(5000);
            while(true){
                Socket socketClient=server.accept();
                Thread serverino=new Thread(new Serverino1(socketClient));
                serverino.start();
        }
        } catch (IOException ex) {
            Logger.getLogger(Serverino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
