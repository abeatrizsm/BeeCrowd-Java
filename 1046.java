import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        int horaInicial = prompt.nextInt();
        int horaFinal = prompt.nextInt();

        int horas = horaFinal - horaInicial;

        if (horas <= 0) {
            horas += 24;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S)");
           
    }
}
