import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);

        float a = prompt.nextFloat();
        float b = prompt.nextFloat();
        float c = prompt.nextFloat();
        
        if(a < b + c && b < a + c && c < b + a){
            float perimetro = a + b + c; 
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else{
            float area = ( ( a + b) * c ) / 2;
           System.out.printf("Area = %.1f\n", area);
        }
    }
}
