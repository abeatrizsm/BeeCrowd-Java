import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
     Scanner prompt = new Scanner(System.in);
     double a = prompt.nextDouble();
     double b = prompt.nextDouble();
     double c = prompt.nextDouble();

     double triangulo = (a*c)/2;
     double circulo = 3.14159 * c * c;
     double trapezio = ((a+b)/2)*c;
     double quadrado = b*b;
     double retangulo = a*b;

     System.out.printf("TRIANGULO: %.3f\n",triangulo);
     System.out.printf("CIRCULO: %.3f\n",circulo);
     System.out.printf("TRAPEZIO: %.3f\n",trapezio);
     System.out.printf("QUADRADO: %.3f\n",quadrado);
     System.out.printf("RETANGULO: %.3f\n",retangulo);
    }
}
