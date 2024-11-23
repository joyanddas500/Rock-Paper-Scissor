import java.util.Scanner;

public class Main { //hell bd

    public static void main(String[] args) 
    {
        String bold = "\u001B[1m";
        String remove = "\u001B[0m";
        String red ="\u001B[31m";

        Scanner input = new Scanner(System.in);

        String space = " ".repeat(50);
        
        System.out.println("\n"+space + "      Rock, Paper, Scissors      ");
        System.out.println(space + "================================\n\n");
        
        System.out.print(" ".repeat(25) + "Enter your name: ");
        String plname = input.nextLine().toUpperCase();

        System.out.println("\n" + " ".repeat(25) + "Preparing Game\n\n");
        try {
            for (int i = 0; i <= 100; i++) 
            {
                System.out.print("\r" + " ".repeat(60) + "\u001B[31m" + i +" %"+ remove);
                if(i == 100)
                {
                    System.out.print("\r" + " ".repeat(60)+"Go! Go! Go!");
                    Thread.sleep(1500);
                    System.out.print("\r"+" ".repeat(55) + bold+"IT'S A PLEASURE TO HAVE YOU HERE MR " +remove+ red + plname + remove +"!");
                    Thread.sleep(2000);
                }
                Thread.sleep(20);
            }


        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        Game gamest = new Game(plname);
        Playerchoice in = new Playerchoice(plname);
        int x =0;
        while (in.getHandch() != "0") {
            x++;
            gamest.gamestart();
            if(x>1)
            {
                System.out.print(in.getSpace()+"\n\n  IF YOU WANT TO EXIT TYPE \u001B[31m \" 0 \" \u001B[0m ");
            }
        }
        
        
        input.close();
    }
}