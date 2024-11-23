import java.util.Random;


public class Computerchoice extends Baseclass {
    private Random ran;

    public Computerchoice() 
    {
        super("Computer");
        ran = new Random();
    }

    @Override
    public void makech() 
    {
        int rannumber = ran.nextInt(3);

        switch (rannumber) {
            case 0:
                handch = "R"; 
                break;
            case 1:
                handch = "P";  
                break;
            case 2:
                handch = "S";  
                break;
        }
    }
}