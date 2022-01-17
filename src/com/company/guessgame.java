import java.util.Scanner;
import java.util.Random;

class game{
    int rand=0;
    int guess=0;
    int no_of_guess=0;
    public int game(){
        Random rd=new Random();
        rand=rd.nextInt(10);
return rand;
    }
    public void userinput(int num){
        num=guess;
    }
    public boolean guess1(){
        if(rand>guess){
            System.out.println("you have entered a smaller number");
            no_of_guess=no_of_guess+1;
return false;
        }
        else if(rand<guess){
            System.out.println("you have entered a bigger number");
            no_of_guess=no_of_guess+1;
            return false;
        }
        else{
            System.out.println("correct answer");
            no_of_guess=1;
            return true;
        }




    }
}
public class guessgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        game gd=new game();
        System.out.println("guess a number");
        gd.userinput(sc.nextInt());
        System.out.println(gd.game());
        while (gd.guess1()){
            System.out.println("guess a number");
            gd.userinput(sc.nextInt());
        }
    }
}