import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket soc = new Socket("localhost", 8888 );
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        String a = in.readLine();
        System.out.println(a);
        a = "Bye bye";
        out.write(a + "\n");
        out.flush();
    }

}