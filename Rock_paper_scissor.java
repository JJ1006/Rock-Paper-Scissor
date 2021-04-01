
import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 0 for Rock, 1 for Paper and 2 for Scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int compInput = random.nextInt(3);
        
        if(userinput == compInput){
            System.out.println("Draw");
        }
        else if (userinput==0 && compInput==2 || userinput==1 && compInput==0 ||
         userinput==2 && compInput==1){
            System.out.println("You Win!!!");
        }
        else{
            System.out.println("You Lose");
        }
        System.out.println("Computer choice: "+compInput);

        sc.close();
    }
}
