import java.util.Scanner;

public class Star02{
    public static void main (String[] args){

        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input02.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.print("*");
        }
    }
}