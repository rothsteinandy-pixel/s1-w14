public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(1000000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
        for(int i = 0; i<3; i++){
         SimMonty m = new SimMonty(i);
         int countRuns = 0;
         myWinTotal = 0;
         while (countRuns <=numGames){
            myWinTotal += m.playGame();
            countRuns++;

         }
         //you write this...
        //  while(){
             
        //  }
         //stop here...
         System.out.println("Type: "+i+" - Win%: "+(myWinTotal * 1.0)/numGames);
        }
    }
    
    
}      
