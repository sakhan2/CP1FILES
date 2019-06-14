import java.util.Scanner;

class cashreg {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        System.out.println("Enter a grade, as an int: ");
        int grade = kin.nextInt();
        String grade1;
        if (grade >= 90) {
            grade1 = "A";
        } else if (grade >= 80) {
            grade1 = "B";
        } else if (grade >= 70) {
            grade1 = "C";
        } else if (grade >= 60) {
            grade1 = "D";
        } else {
            grade1 = "F";
        }
        System.out.print("Letter Grade: " + grade1);
    }
}