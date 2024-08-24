import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int distancia = prompt.nextInt();

        int tempo = distancia*2;

        System.out.println(tempo + " minutos");
        prompt.close();
    }
}
