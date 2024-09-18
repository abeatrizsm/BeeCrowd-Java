import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        
       float x = prompt.nextFloat();
       float y = prompt.nextFloat();

    if(x > 0 && y > 0){
        System.out.println("Q1");
    }
    if(x < 0 && y > 0){
        System.out.println("Q2");
    }
    if(x < 0 && y < 0){
        System.out.println("Q3");
    }
    if(x > 0 && y < 0){
        System.out.println("Q4");
    }
    if(x == 0 && y != 0){
        System.out.println("Eixo Y");
    }
    if(y==0 && x != 0){
        System.out.println("Eixo X");
    }
    if(x == 0 && y == 0){
        System.out.println("Origem");
    }
    }
}
