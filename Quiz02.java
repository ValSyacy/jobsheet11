import java.util.Scanner;
import java.util.Random;

public class Quiz02 {
    public static void main (String[] args){

        Random random02 = new Random();
        Scanner input02 = new Scanner(System.in);

        char menu = 'y';
        do{
            int number = random02.nextInt(10);
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input02.nextInt();
                input02.nextLine();

                if (answer < number){
                    System.out.println("Angka lebih besar!");
                }else if (answer > number){
                    System.out.println("Angka lebih kecil!");
                }
                
                success = (answer == number);
            }while(!success);
            System.out.print("Apakah Anda Ingin Mengulang permainan? (y/t)");
            menu = input02.nextLine().charAt(0);
        }while (menu=='y' || menu == 'Y');
    }
}
