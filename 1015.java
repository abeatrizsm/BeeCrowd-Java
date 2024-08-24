import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        float x1 = prompt.nextFloat();
        float y1 = prompt.nextFloat();
        float x2 = prompt.nextFloat();
        float y2  = prompt.nextFloat();

        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", distancia);
        prompt.close();
    }
}
