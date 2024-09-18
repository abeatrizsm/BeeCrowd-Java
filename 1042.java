import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        
        int original[] = new int[3];

        for (int i = 0; i < original.length; i++) {
            int n = prompt.nextInt();
            original[i] = n;
        }

        int invertido[] = Arrays.copyOf(original, 3);
        Arrays.sort(invertido);

        for (int i = 0; i < original.length; i++) {
            System.out.println(invertido[i]);
        }
        
        System.out.println("");
        
        for (int i = 0; i < invertido.length; i++) {
            System.out.println(original[i]);
        }
    }
}
