import java.util.Scanner;

public class TugasIndividu{
    public static void main (String[] args){

        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input02.nextInt();

        System.out.print("Tugas Individu 1");
        for (int i = 0; i <= N; i++) {
            for (int j = N; j > i; j--) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        System.out.println("\nTugas Individu 2");
        for(int i = N; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nTugas Individu 3");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == (N - 1) || j == 0 || j == (N - 1)) {
                    System.out.print(N + " ");
                } else if (j == 1 || j == (N - 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}