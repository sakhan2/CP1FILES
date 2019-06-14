import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.print("Enter number of hours worked: ");
    int h = kin.nextInt();
    System.out.print("Enter wage amount: ");
    double w = kin.nextDouble();
    
    System.out.println("Total paycheck: $" + weeklyPaycheck(h, w));
  }
  
  public static double weeklyPaycheck(int hours, double wage){
    /* YOUR CODE GOES HERE */
    if (hours > 40)
    {
    
    return ((hours - 40)*(wage * 1.5) + 480);
    }
    
   
    return ((hours)*(wage));
    
    }
}

  
