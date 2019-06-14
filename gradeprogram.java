import java.lang.Math;
import java.util.Scanner;


public class gradeprogram 
{
     public static void main (String [] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to the Grade Calculator");
            System.out.println("\nPlease Enter Grades for the Homework");
            double hw1 = s.nextDouble();
            System.out.println("HW1: " + hw1);
            double hw2 = s.nextDouble();
            System.out.println("HW2: " + hw2);
            double hw3 = s.nextDouble();
            System.out.println("HW3: " + hw3);
            double totalhw = ((hw1 + hw2 + hw3)/3);
            double totalhwperc = totalhw * .20;
            System.out.println("\nPlease Enter Grades for the Quizzes");
            double q1 = s.nextDouble();
            System.out.println("Qu                                                                                                                            iz1: " + q1);
            double q2 = s.nextDouble();
            System.out.println("Quiz2: " + q2);
            double qaverage = ((q1 + q2)/2);
            double qaverageperc = qaverage * .50;
            System.out.println("\nPlease Enter Grades for the Final Exam");
            double exam = s.nextDouble();
            double examaverage = exam *.30;
            System.out.println("Final: " + exam);
            System.out.println("\nThe average of the Homework is: " + totalhw + "%");
            System.out.println("The average of the Quizzes is: " + qaverage + "%");
            System.out.println("The average of the Final Exam is: " + exam + "%");
            double final2 = (totalhwperc + qaverageperc + examaverage);
            System.out.println("\nYour Final grade is: " + final2 + "%");
            
            
            
        }
    }