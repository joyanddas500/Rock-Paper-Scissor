    import java.util.Scanner;
    public abstract class Baseclass {
    protected String name;
    protected String handch;
    protected String space;
    protected String colorrad;
    protected String colorremove;

    protected Scanner input;
   
    public Baseclass(String name) 
    {
        this.name = name;
        this.input = new Scanner(System.in);
    }
    public Scanner getInput()
    {
        return input ;
    }

    public String getName() 
    {
        return name;
    }

    public String getHandch() 
    {
        return handch;
    }
    public String getSpace()
    {
        return " ".repeat(25);
    }
    public String getColorrad()
    {
        return "\u001B[31m" ;
    }
    public String getColorremove()
    {
        return "\u001B[0m";
    }
   

    public abstract void makech();
}