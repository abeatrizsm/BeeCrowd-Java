import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        double tempo = prompt.nextDouble();
        int velocidade = prompt.nextInt();
        
        double litros = (tempo * velocidade)/12;

        System.out.printf("%.3f\n", litros);
        prompt.close();
    }
}
