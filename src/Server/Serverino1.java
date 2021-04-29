/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alampi.adrian
 */
public class Serverino1 implements Runnable {

    private Socket clientSocket;

    public Serverino1(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        char carattere;
        try {
            OutputStream Client = clientSocket.getOutputStream();
//            BufferedWriter Write = new BufferedWriter(new OutputStreamWriter(Client));
            InputStream dalClient = clientSocket.getInputStream();
            BufferedReader lettore = new BufferedReader(new InputStreamReader(dalClient));
            carattere = (char) lettore.read();
            System.out.println(carattere);
            lettore.close();
//            Write.close();
            System.out.println("The END");
        } catch (IOException ex) {
            Logger.getLogger(Serverino1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
