import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        
        int a = prompt.nextInt();
        int b = prompt.nextInt();
        int c = prompt.nextInt();
        int d = prompt.nextInt();

        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
        
    }
}
