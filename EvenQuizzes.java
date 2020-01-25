//*************************************************************************
// EvenQuizzes.java           Author: Khaled Alshatti
//
// a program the helps to grade quizzes.
//
// ************************************************************************
import java.util.*;

public class EvenQuizzes
{
   public static void main (String [] args)
   {
      int questions, answers, count;
      int correctAns, incorrectAns;
      double percentage;
      String more;
    
      Scanner scan = new Scanner (System.in);
      
      do
      {
         
         correctAns = 0;
         incorrectAns = 0;
         
         //askes the user to input the number of questions
         System.out.println("How many questions are on the quiz?");
         questions = scan.nextInt();
         
         int[] answerKey = new int [questions];
         
         //a for loop asking for the correct answers
         for(int i = 0; i<answerKey.length; i++)
         {
            System.out.println("What is the correct answer of question " + (i+1) + "?");
            answerKey[i] = scan.nextInt();      
         
         }
         count =0;
         //a for loop asking for the students answers
         for(int i = 0; i<answerKey.length; i++)
         {
            System.out.println("What is the student's answer for question " + (i+1) + "?");
            answers = scan.nextInt();
            
            if(((i+1) % 2) == 0)
            {
               count++;
               
               if(answers == answerKey[i])
               {
                  correctAns++;
               }   
            }
            
             /*   
            if(answers == answerKey[i] && i+1 %2 ==0)
               correctAns++;
            else
               incorrectAns++;*/
         }
         
         //calculations for the percentage
         percentage = ((double) correctAns/((double) questions/2))*100;
         
         //output the information
         System.out.println("There are " + correctAns + " correct answers");
         System.out.println("There are " + incorrectAns + " incorrect answers");
         System.out.println("The student recieved " + percentage + "%");
         
         //ask if the user wants to grade another quiz
         System.out.println("Grade another quiz?(y/n)");
         more = scan.next();
      }
      //if the user types "y" the program askes for the number of questions again
      while(more.equals("y"));
   }
}
