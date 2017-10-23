package com.shrbank.service;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServer
{
    public void server()
    {
        ServerSocket server = null;
        try {
            server = new ServerSocket(19601);
        }
        catch (IOException e1) {
            e1.printStackTrace();
        }
        Socket socket = null;
        while (true)
        {
            try
            {
                socket = server.accept();
                TalkServer.Handle h = new TalkServer.Handle(socket);
                h.start();
            }
            catch (Exception e)
            {
                System.out.println("Error." + e);
            }
        }
    }

    public static void main(String[] args)
    {
        new TalkServer().server();
    }

    class Handle extends Thread
    {
        Socket s = null;

        public Handle(Socket s) {
            this.s = s;
        }

        public void run()
        {
            try
            {
                BufferedInputStream bis = new BufferedInputStream(this.s.getInputStream());

                byte[] readByte = new byte[2048];
                while (true) {
                    int read = bis.read(readByte);

                    if (read == -1) {
                        break;
                    }
                    byte[] readContend = new byte[read];
                    System.arraycopy(readByte, 0, readContend, 0, read);
                    System.out.println(new String(readContend));
                }

                bis.close();

                this.s.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
