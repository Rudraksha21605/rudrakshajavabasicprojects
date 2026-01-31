import java.util.*;
public class Game 
{
    boolean flag=false;
    int compinput;
    int userinput;
    Scanner sc=new Scanner(System.in);
    Random rd=new Random();
    public Game()
    {
        compinput=rd.nextInt(100);
    }
    public void playgame()
    {
        while(flag!=true)
        {
            takeuserinput();
            isCorrect();
        }
    }
    public void  takeuserinput()
    {
        System.out.println("Enter your number");
        userinput=sc.nextInt();
    }
    public  void isCorrect()
    {
        if(userinput==compinput)
        {
            System.out.println("You guessed it right");
            flag=true;  
        }
        else if(userinput>compinput)
        {
            System.out.println("You guessed the number bigger than the right number");
            flag=false;
        }
        else
        {
            System.out.println("You guessed the number smaller than the right number");
            flag=false;
        }
    }
        public static void main(String[] args)
    {
        Game obj=new Game();
        obj.playgame();
       
    }
}


