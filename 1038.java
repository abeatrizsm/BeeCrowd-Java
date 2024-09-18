import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);

        int codigo = prompt.nextInt();
        int quantidade = prompt.nextInt();
        double preco = 0;

        if(codigo == 1){
            preco = quantidade * 4;
        }
        else if(codigo == 2){
            preco = quantidade * 4.5;
        }
        else if(codigo == 3){
            preco = quantidade * 5;
        }
        else if(codigo == 4){
            preco = quantidade * 2;
        }
        else if(codigo == 5){
            preco = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f\n", preco);
    }
}
