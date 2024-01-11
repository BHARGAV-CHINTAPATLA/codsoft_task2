import java.util.*;
public class StudentGradeCalculator{

     public static void main(String []args){
        int sum = 0;
        int i = 0;
        System.out.println("Grades considered as:");
        System.out.println("'A+' Grade: >94(Above 94)");
        System.out.println("'A' Grade: <94 & >=88");
        System.out.println("'B+' Grade: <88 & >=82");
        System.out.println("'B' Grade: <82 & >=76");
        System.out.println("'C+' Grade: <76 & >=70");
        System.out.println("'C' Grade: <70 & >=64");
        System.out.println("'D+' Grade: <64 & >=58");
        System.out.println("'D' Grade: <58 & >=52");
        System.out.println("'E+' Grade: <52 & >=46");
        System.out.println("'E' Grade: <46 & >=40");
        System.out.println("'F' Grade: <40(Below 40)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of subjects:");
        int m = sc.nextInt();
        for(i=0;i<m;i++){
            System.out.println("Subject name:");
            String subject = sc.next();
            System.out.println("Marks obtained :");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
              System.out.println("Marks should be between 0 and 100. Please re-enter:");
              marks = sc.nextInt();
            }
            System.out.println(subject+":"+marks);
            sum = sum + marks;
        }
        System.out.println("Total Marks:"+sum);
        int average = sum/m;
        System.out.println("Average Percentage:"+average);
        if(average>=94) {
          System.out.println("Your Final Grade:A+");  
        }
        else if(average<94 && average>=88) {
          System.out.println("Your Final Grade:A");
        }  
        else if(average<88 && average>=82) {
          System.out.println("Your Final Grade:B+");
        }
        else if(average<82 && average>=76) {
          System.out.println("Your Final Grade:B");
        } 
        else if(average<76 && average>=70) {
          System.out.println("Your Final Grade:C+");
        } 
        else if(average<70 && average>=64) {
          System.out.println("Your Final Grade:C");
        }  
        else if(average<64 && average>=58) {
          System.out.println("Your Final Grade:D+");
        }
        else if(average<58 && average>=52) {
          System.out.println("Your Final Grade:D");
        } 
        else if(average<52 && average>=46) {
          System.out.println("Your Final Grade:E+");
        } 
        else if(average<46 && average>=40) {
          System.out.println("Your Final Grade:E");
        }
        else{
          System.out.println("Your Final Grade:F");
        }  
        System.out.println("Your Final Grade has been calculated by average of your marks obtained."); 
        System.out.println("THANKS FOR USING OUR STUDENT GRADE CALCULATOR ");
     }
}