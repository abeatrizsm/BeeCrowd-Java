import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        
        int a = prompt.nextInt();
        int b = prompt.nextInt();
        int aux = 0;

        if (b > a) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a % b == 0) {
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
