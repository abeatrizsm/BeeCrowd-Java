import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int idade = prompt.nextInt();
        int dia, mes, ano;

        ano = idade/365;
        mes = (idade%365)/30;
        dia = (idade%365)%30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}
