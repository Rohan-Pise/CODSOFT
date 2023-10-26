import java.util.Scanner;
public class RandomNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("---------------WELCOME TO THE NUMBER GUESSING GAME ---------------");
        System.out.println("You have three chances to guess the correct number");
        int chances=3;
        int score =0;
        while(true){
            int target = random();
            //System.out.println(target);
            for (int i = 0; i < chances; i++)
            {
                System.out.print("Guess the Number: ");
                int guess=sc.nextInt();
                if(guess == target)
                {
                    System.out.println("\nGreat!you Guessed the correct number");
                    score += 10;break;
                }
                else if ( guess < target)
                {
                    System.out.println("     Low");
                }
                else
                {
                    System.out.println("     High");
                }
            }
            System.out.println("YOUR SCORE IS: "+score);
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.print("Do you want to play once again(Yes/No)]: ");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("No") || !choice.equalsIgnoreCase("Yes") )
            {
                System.out.println("Thank You,Hope you enjoyed");
                System.exit(0);
                continue;
            }
        }
    }
    public static int random()
    {
        double num=Math.random() * 100; //0 -99.9999999
        num +=1;//0 - 100
        return (int)num;
    }
}