import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        String host = "netology.homework";
        int port = 8087;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
             out.println("Student netology");

             final String RESPONSE_1 = in.readLine();
             System.out.println(RESPONSE_1);
             out.println("yes");

            final String RESPONSE_2 = in.readLine();
            System.out.println(RESPONSE_2);
            out.println("Bye!");

            final String RESPONSE_3 = in.readLine();
            System.out.println(RESPONSE_3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
