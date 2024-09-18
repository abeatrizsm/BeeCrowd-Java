import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        float a = prompt.nextFloat();
        float b = prompt.nextFloat();
        float c = prompt.nextFloat();

        float delta = (float)(Math.pow(b, 2) - 4 * a * c);

        if (a != 0 && delta > 0) {
            float x1 = (float)((-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float)((-b - Math.sqrt(delta)) / (2 * a));
            System.out.printf("R1 = %.5f\n", x1 );
            System.out.printf("R2 = %.5f\n", x2 );
        }
        else{
            System.out.println("Impossivel calcular");
        }
    }
}
