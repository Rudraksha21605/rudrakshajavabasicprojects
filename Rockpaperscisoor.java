import java.util.*;
public class Rockpaperscisoor {
    public static void main(String[] args){
        System.out.println("Enter 0 for rock,1 for paper and 2 for scissor");
        Scanner sc =new Scanner(System.in);
        int userinput=sc.nextInt();
        Random random=new Random();
        int compinput=random.nextInt(3);
        if(compinput==userinput)
        {
            System.out.println("draw");
        }
        else if(compinput==0 && userinput==1 || compinput==1 && userinput==2 || compinput==2 && userinput==0)
        {
            System.out.println("You Win");
        }
        else
        {
            System.out.println("Computer win");
        }
    System.out.println("Computer choice:"+ compinput);
    }
}
