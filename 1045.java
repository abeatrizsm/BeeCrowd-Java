import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        
        float a = prompt.nextFloat();
        float b = prompt.nextFloat();
        float c = prompt.nextFloat();
        
        float[] array = {a, b, c};
        Arrays.sort(array);
        
        c = array[0];
        b = array[1];
        a = array[2];
        
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((a * a) == (b * b) + (c * c)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a * a) > (b * b) + (c * c)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a) < (b * b) + (c * c)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && a == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
