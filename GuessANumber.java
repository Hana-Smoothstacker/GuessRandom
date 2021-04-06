import java.util.Scanner;
//import java.lang.*;

public class GuessANumber {
    public static void main(String args[]) {
        int min = 1;
        int max = 100;       

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        Scanner in = new Scanner(System.in);
        boolean guessed = false;

        for(int i=0; i<6; i++){     
            int guess = in.nextInt();
            if((Math.abs(guess - random_int))<=10){
                System.out.println("The number is: " + random_int);
                guessed = true;
                break;
            }
            else {
                System.out.println("Nice try! Do it again");
            } 
        }
        in.close();
        if(guessed != true){
        System.out.println("Sorry. The number is: " + random_int);
        }        
    }
}