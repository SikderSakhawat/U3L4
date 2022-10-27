import java.util.Scanner;
import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to start at? ");
        int userNumber = scanner.nextInt();
        int tempNum = userNumber;
        while (tempNum >= 0){
            System.out.print(tempNum + ", ");
            if(tempNum == 0){
                System.out.println("Time's up! " + userNumber + " seconds have passed!");
            }
            tempNum--;
        }
    }
}


