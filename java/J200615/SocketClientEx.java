package J200615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClientEx {

    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4200);
            InputStreamReader sr = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(sr);
            String advice = br.readLine();
            System.out.println("Today you should: " + advice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SocketClientEx sClient = new SocketClientEx();
        sClient.go();
    }
}
