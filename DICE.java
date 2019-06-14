import java.util.Scanner;
import java.util.Random;
public class DICE
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        boolean b = true;
        System.out.println("Rolling two dice\n");
        while (b)
        {
            int dog1 = (int)(6.0 * Math.random()) + 1;
            int dog2 = (int)(6.0 * Math.random()) + 1;
            System.out.println("Die 1: " + dog1 + ", Die 2: " + dog2 + ", sum of two dice: " + (dog1+dog2));
            System.out.print("Would you like to roll again? (y/n) ");
            if (scan.nextLine().equals("y"))
            {
             b = true;   
            }
            else
            {
             b = false;
             System.out.print("\n\nGoodbye");
            }
        }
    }

}