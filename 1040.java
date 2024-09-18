import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);

        float n1 = prompt.nextFloat();
        float n2 = prompt.nextFloat();
        float n3 = prompt.nextFloat();
        float n4 = prompt.nextFloat();
        
        double media = ( (n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;

        if (media >= 7) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else if(media<7 && media>=5){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");

            float n5 = prompt.nextFloat();

            System.out.printf("Nota do exame: %.1f\n", n5);

            media = (media + n5)/2;
            
            if(media>=5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media);
            }
            else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media);
            }
        }
        else{
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
    }
}
