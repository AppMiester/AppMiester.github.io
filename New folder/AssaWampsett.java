import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AssaWampsett extends FishingAction {
	
	int x;
	int c;
	
	
public void TryAssaWampsett() {
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");

	Cast rod = new Cast();
	
	while(true) {
		
	System.out.println("           ASSAWAMPSETT POND");	
		
	rod.run();
   
	Random rand= new Random();
    x=rand.nextInt(4);
    
    if(x==0){
    	
    	 trout();
            }
   
    if(x==1){
          bass();
           }
    
    if(x==2){
    Johns john= new Johns();
    john.Sunfish();
        }
    
    if(x==3){
    	super.Nada();
          }
    
    if(totalcatch==3 && hasBoat==false) {
    	super.getBoat();
    	hasBoat= true;
            } 
     
       
    System.out.println("");
    System.out.println("");
    System.out.println("  enter 1: to cast again:\n" + "  enter 2: to move to John's pond\n" + "  enter 3: to move to Van's Abyss\n"+ "  enter 4: to quit");
	
	
	
while(true) {   //question check****
	    
		
     while(true) {    // checks input *******************
			
	
	     try {
  
				@SuppressWarnings("resource")
				Scanner choice = new Scanner(System.in);	
                c = choice.nextInt();
                    
  
	      }catch(InputMismatchException e) {
		      System.out.println("error wrong data type");
		      System.out.println("enter 1 2 3 or 4");
		      continue;
		            }
			
			
			if(c==1 || c== 2|| c==3 || c==4) {
			    break;
			      }
			
			if(c != 1 && c != 2 && c != 3 && c!=4) {
		     System.out.println("error");
			 System.out.println("enter 1 2 3 or 4");
			       }
		
          }// closes input check
	
	    break;
	}// closes question check

	
	
	 if(c==1) {
		 System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
		 System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
		 System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
		 continue;
	    }else {
		 break;
	       }
	}//-- closes while loop enviroment
	
	if(hasBoat==false) {
		 super.walk();
	       }else {
	    	   super.steam();
	              }
	
	Johns j = new Johns();
	VansAbyss v = new VansAbyss();
	
	switch(c) {
	
	 case 2:
	
	    j.TryJohns();
		break;
		
	 case (3):
		
		 v.TryVansAbyss();
		   }
	
	    
	   
}//closes try method



public  void trout() {
	System.out.println("\n" + "\n");
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
	System.out.println("  You caught a trout");
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("\n"+"\n"+"\n");
	
	System.out.println("\n"+"\n");
	System.out.println(" \\\\\\\\\\  _____________/||||\\______________________");
	System.out.println("   \\\\\\\\/  ** * * * * * * *  * * * * *   0        \\__");
	System.out.println("    --- * * *** * * * *   * * * * *   (           __|");
	System.out.println("    ---  ** * * * * *** * ** * * * *               _|");
	System.out.println("    ///////\\___________________________    ______/");
	System.out.println("  //////                             ///////");
	System.out.println("");
	System.out.println("\n\n");
	super.setCatch(0, 1, 0, 1);
	super.getCatch();
	System.out.println("");
	
	
}

public void bass() {
	System.out.println("\n" + "\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("  You caught a bass !!!");
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n"+"\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("  __         ________________                __");
	System.out.println(" |- \\       / |||||| | | || |\\          ____/  \\");
	System.out.println(" |-   \\--------------------------------/       _/");
	System.out.println(" |-                               *   O      _/");
	System.out.println(" |-                              *           /");
	System.out.println(" |-                              *         |___");
	System.out.println(" |- /---\\                         *            \\__");
	System.out.println(" |_/     \\                                        \\");
	System.out.println("          \\_________________________\\      _______/");
	System.out.println("                                     ///////");
	System.out.println("                                     ////");
	System.out.println("");
    super.setCatch(0,0,1,1);
    super.getCatch();
    System.out.println("\n");
	
}


}
