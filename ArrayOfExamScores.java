// Name : JiaYang Wu
// Date : 12/8/2021
// Description: CS210, BC; a simple program demonstrating the
// use of arrays
import java.util.Scanner;
import java.util.Random;

public class ArrayOfExamScores {

    // The main method
   public static void main(String[] args) {

      Scanner keyboard = new Scanner (System.in);
      System.out.print("How many students are in the class? ");
      int numStudentsInClass = keyboard.nextInt(); 
        

      int [] arrayOfTestScores = new int[numStudentsInClass];

      Random random = new Random(); 
      
      int runningTotal = 0;
      int maximumScore = 0;
      int maximumScoreStudent = 0;
      int minimumScore = 100;
      int minimumScoreStudent = 0;
           

      for (int i = 0; i < arrayOfTestScores.length; ++i) {
      
         arrayOfTestScores[i] = random.nextInt(101);
         
         System.out.println("Student number " + (i+1) + " has a score of " + arrayOfTestScores[i]);
         
         runningTotal+=  arrayOfTestScores[i];
         
         if (arrayOfTestScores[i] > maximumScore) {
             maximumScore = arrayOfTestScores[i];
             maximumScoreStudent = i+1;
         }
           
         if (arrayOfTestScores[i] < minimumScore) {
             minimumScore = arrayOfTestScores[i];
             minimumScoreStudent = i+1;
         }
      }        
      
      System.out.println("The class average was " + ((double) runningTotal / numStudentsInClass));
      System.out.println("Student " + maximumScoreStudent + " scored the highest in the class, and the score was " + maximumScore + " points");
      System.out.println("Student " + minimumScoreStudent + " scored the highest in the class, and the score was " + minimumScore + " points");                

    }
}
