import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int num1;
        int num2;
        int chance = 0;

        while(chance < 5) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a number between 1 - 100: ");
        num2 = scan.nextInt();
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int randNumber = rand.nextInt(1000);
        num1 = randNumber;

//        int chance = 0;
//        while(chance < 5) {
            if (num2 < (num1 - 10) && num2 > 0){

                System.out.println("Number entered is too small..... Try Again!!");
                chance++;
            }
            else if (num2 > (num1 + 10) && num2 <1000){

                System.out.println("Number entered is too big..... Try Again!!");
                chance++;
            }
            //check for  range 40 to 50
            else if (num2 > (num1 - 10) && num2 <num1){

                System.out.println("You are Close..... Try Again!!");
                chance++;
            }
            //check for range 60 to 100
            else if (num2 > num1 && num2 < (num1 + 10)){

                System.out.println("Number entered is too big..... Try Again!!");
                chance++;
            }
            //check for the Match
            else if (num2 == num1) {
                System.out.println("Number entered is too big..... Try Again!!");
                return;
            }
            else if(num2 > 1000){
                System.out.println("Number entered is out of the given range!!");
                return;
            }
//
//            System.out.println("Number of chances taken : " + chance);
        }
        //scan.close();

        System.out.println("Number of chances taken : " + chance);
    }
}
