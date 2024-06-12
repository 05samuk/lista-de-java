import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i =1; i<=10; i++){
            System.out.println("tabuada do " + i);
            for (int j =1; j<=10; j++){
                System.out.println(i + "x" + j + "=" + j*i );
            }
        }
    }
}