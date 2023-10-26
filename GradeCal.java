import java.util.Scanner;
public class GradeCal
{
        public static void main(String[] args)
        {
            float total=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nIm your Grade Calculator");
            System.out.print("Enter the number of subjects for which you want to enter marks: ");
            float num=sc.nextFloat();
            for (int i = 1; i <=num;i++)
            {
                System.out.print("Enter the mark of subject " +i +" (out of 100): ");
                float marks=sc.nextFloat();
                total += marks;
                if(marks>100 || marks<0)
                {
                    System.out.println("Invalid marks \n Enter Proper marks ");
                    return;
                }
            }
            float avg=(total/num);
            System.out.println(" \nHere is your Scorecard : \n");
            System.out.println("So your Total is: "+ total);
            System.out.println("Your Average Score: "+ avg);
            if(avg >=90)
                System.out.println("You got A Grade");
            else if(avg <90 & avg >=80)
                System.out.println("You got B Grade");
            else  if(avg < 80 & avg >=70)
                System.out.println("You got C Grade");
            else if(avg <70 & avg >=60)
                System.out.println("You got D Grade");
            else
                System.out.println("Try well next time");

        }
    }


