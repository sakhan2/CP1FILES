import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //DO NOT EDIT LINES 1-15
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Number of ints: ");
        int numOfInts = keyboard.nextInt();

        int[] ints = new int[numOfInts];
        for(int i = 0; i < numOfInts; i++)
        {
            System.out.println("Enter an int: ");
            ints[i] = keyboard.nextInt();
        }

        //Call printit() method
        allPositive(ints);
    }

    public static boolean allPositive(int [] joe)
    {

        for (int i= 0; i < joe.length; i++) 
        {
            if (!(joe[i] >0 ))
            {
                return false; 
            }
            
        }
        return true;
    }

}

  	
