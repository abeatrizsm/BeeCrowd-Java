import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
     Scanner prompt = new Scanner(System.in);
     String nome = prompt.next();
     double salariof = prompt.nextDouble();
     double vendas = prompt.nextDouble();

     double salario = salariof + (vendas*0.15);

     System.out.printf("TOTAL = R$ %.2f\n", salario);
     
    }
}