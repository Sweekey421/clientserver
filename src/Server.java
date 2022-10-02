
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args ) throws IOException {
        ServerSocket ser = new ServerSocket(8888);
        Socket client = ser.accept();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            String a = "Write here:";
            out.write(a + "\n");
            out.flush();
            a = in.readLine();
            System.out.println(a);
        } catch (IOException e){
            System.out.println(e);
        }
    }

}