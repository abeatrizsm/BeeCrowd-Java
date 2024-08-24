import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int x = prompt.nextInt();
        Float y = prompt.nextFloat();
        
        Float consumo = x/y;

        System.out.printf("%.3f km/l\n", consumo);
        prompt.close();
    }
}

