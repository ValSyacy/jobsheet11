import java.util.Scanner;

public class NestedLoop_2341760024 {
    public static void main (String[] args){

        Scanner input02 = new Scanner(System.in);
        
        int temps02[][] = new int[5][7];

        for (int i = 1; i < temps02.length; i++){
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps02[0].length; j++){
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps02[i][j] = (int) input02.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps02.length; i++){
            int total = 0;
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps02[0].length; j++){
                System.out.print(temps02[i][j] + " ");
                total += temps02[i][j];
            }
            int rata2 = total / temps02.length;
            System.out.println("Rata-rata suhu kota adalah: " + (i+1)+ rata2);
        }
        
    }
}
