import java.util.Scanner;

public class Square02{
    public static void main (String[] args){

        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input02.nextInt();

        for(int iOuter = 1; iOuter <= N; iOuter++){
            for (int i = 1; i <= N; i++){
                System.out.print("*");
        }
        System.out.println();
        }
    }
}