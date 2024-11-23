public class Playerchoice extends Baseclass {

    public Playerchoice(String name) {
        super(name); //hudaiiiiiiiii
    }

    @Override
    public void makech() {
        System.out.println("\n" +getSpace()+" \u001B[31m" + getName() +" ,\u001B[0m MAKE YOUR CHOICE _ ");
        System.out.println(getSpace()+"FOR ROCK      = R ");
        System.out.println(getSpace() +"FOR PAPER     = P ");
        System.out.println(getSpace() +"FOR SCISSOR   = S \n");
        System.out.print(getSpace()+"\u001B[32m TYPE  :  \u001B[0m");

        handch = getInput().nextLine().toUpperCase();
        int x = 0;
        switch (handch) {
            case "R":
                System.out.println( "\n"+getSpace()+getName() + " , YOU CHOSE ROCK ");
                break;
            case "P":
                System.out.println(getSpace()+getName() + " , YOU CHOSE PAPER ");
                break;
            case "S":
                System.out.println(getSpace()+getName() + " , YOU CHOSE SCISSOR ");
                break;
            default:
                if (handch.equals("0"))
                {
                    break;
                }
                x++;
                if(x == 1)
                {
                    System.out.println(getSpace()+"\u001B[31mINVALID INPUT ...  TRY AGAIN \u001B[0m!");

                }
                else
                {
                    System.out.println(getSpace()+"\u001B[31m DON'T WORRY, MISTAKES ARE PROOF THAT YOU'RE TRYING\u001B[0m \u001B[33m:) \u001B[0m!");

                }
                makech();
                break;
        }
        
    }
}