import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        
        double valorerrado = prompt.nextDouble();
        double valor = valorerrado + 0.001;
        
        int cem = (int)(valor/100);
        valor %= 100;
        
        int ciquen = (int)(valor/50);
        valor %= 50;
        
        int vin = (int)(valor/20);
        valor %= 20;
        
        int dez = (int)(valor/10);
        valor %= 10;
        
        int cin = (int)(valor/5);
        valor %= 5;
        
        int dois = (int)(valor/2);
        valor %= 2;
        
        int um = (int)(valor/1);
        valor %= 1;
        
        int ccin = (int)(valor/0.5);
        valor %= 0.5;
        
        int cvin = (int)(valor/0.25);
        valor %= 0.25;
        
        int cdez = (int)(valor/0.1);
        valor %= 0.1;
        
        int cci = (int)(valor/0.05);
        valor %= 0.05;
        
        int cum = (int)(valor/0.01);
        
       System.out.println("NOTAS:");
       System.out.println(cem + " nota(s) de R$ 100.00" );
       System.out.println(ciquen + " nota(s) de R$ 50.00");
       System.out.println(vin + " nota(s) de R$ 20.00");
       System.out.println(dez + " nota(s) de R$ 10.00");
       System.out.println(cin + " nota(s) de R$ 5.00");
       System.out.println(dois + " nota(s) de R$ 2.00");
       System.out.println("MOEDAS:");
       System.out.println(um + " moeda(s) de R$ 1.00");
       System.out.println(ccin + " moeda(s) de R$ 0.50");
       System.out.println(cvin + " moeda(s) de R$ 0.25");
       System.out.println(cdez + " moeda(s) de R$ 0.10");
       System.out.println(cci + " moeda(s) de R$ 0.05");
       System.out.println(cum + " moeda(s) de R$ 0.01");
        
    }
}
