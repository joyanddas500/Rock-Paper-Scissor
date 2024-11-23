public class Game {
    private Playerchoice x;
    private Computerchoice y;
    
    public int cCount=0;
    public int pcount =0;
    public int tie = 0;
   

    public Game(String name) 
    {
        this.x= new Playerchoice(name);
        this.y = new Computerchoice();
    }
        

        public void gamestart()
        {
            System.out.println("\n\n\n\n"+" ".repeat(50) +"--------------------------------");
            System.out.println(" ".repeat(50) +"           GAME START           ");
            System.out.println(" ".repeat(50) +"--------------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            y.makech();
            x.makech();

            System.out.println(y.getSpace()+"RESULT LOADING  .  .  .");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            winner(y.getHandch());

            
            System.out.println(x.getSpace()+"Computer Choise : \"\u001B[31m" + y.getHandch() + "\u001B[0m\"");

        }

        private void winner(String computerarmatha){
            String plchoice = x.getHandch();

            if(plchoice.equals("0")){
                
            }
            else if (computerarmatha.equals(plchoice)) {
                System.out.println(x.getSpace()+"\"\u001B[31m Ahaaa THIS IS TIE \"\u001B[0m ");
                tie++;
            } 
            else if (plchoice.equals("R") && computerarmatha.equals("S") || plchoice.equals("P") && computerarmatha.equals("R") || plchoice.equals("S") && computerarmatha.equals("P")) 
            {   
                System.out.println("\"\u001B[32m  WOW YOU WIN \"\u001B[0m "+ x.getName().split(" ")[0] );
                pcount++;
            } 
            else 
            {
                System.out.println("\"\u001B[31m YOU LOSS \"\u001B[0m ");
                cCount++;
            }                 
            



        }
    
}