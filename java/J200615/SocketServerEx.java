package J200615;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerEx {
    String[] adviceList = { "A", "B", "C" };

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4200);

            while (true) {
                Socket sck = serverSocket.accept();

                PrintWriter writer = new PrintWriter(sck.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        SocketServerEx server = new SocketServerEx();
        server.go();
    }
}