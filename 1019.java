import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int tempo = prompt.nextInt();
        int horas, minutos, segundos;

        horas = tempo / 3600;             
        tempo = tempo % 3600;             

        minutos = tempo / 60;             
        segundos = tempo % 60;            

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
