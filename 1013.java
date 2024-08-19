import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int a = prompt.nextInt();
        int b = prompt.nextInt();
        int c = prompt.nextInt();

        int maiorab = (a+b+Math.abs(a-b))/2;
        int maior = (c + maiorab + Math.abs(c-maiorab))/2;

        System.out.println(maior + " eh o maior");
        prompt.close();
    
    }
}

