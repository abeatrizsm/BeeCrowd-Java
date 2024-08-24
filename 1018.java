import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int valor = prompt.nextInt();

        int cem = valor/100;
        int rcem = valor%100;

        int cinq = rcem/50;
        int rcinq = rcem%50;

        int vinte = rcinq/20;
        int rvinte = rcinq%20;

        int dez = rvinte/10;
        int rdez = rvinte%10;

        int cinc = rdez/5;
        int rcinc = rdez%5;

        int dois = rcinc/2;
        int rdois = rcinc%2;

        int um = rdois;

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinq + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinc + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
        prompt.close();
    }
}
