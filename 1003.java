import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int a = prompt.nextInt();
        int b = prompt.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma );
        prompt.close();
        
  
    }
 
}