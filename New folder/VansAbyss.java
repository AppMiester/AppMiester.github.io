import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class VansAbyss extends FishingAction{
	
	int x;
	int c;
	
	
public void TryVansAbyss() {
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");

	Cast rod = new Cast();
	int count = 0;
	
	while(true) {
		
	System.out.println("           VAN'S ABYSS");	
		
	rod.run();
	count++;// counter to trigger boat problem
   
	Random rand= new Random();
    x=rand.nextInt(3);
    
    if(x==0) {
    	nothing();
           }
   
    if(x==1 ){
      tri();
        }
    
    if(x==2 ){
    octal();
       }
    
    if(count == 4 && hasBoat == true) { //---trigger starts 1st part of boat problem routine
    	
    	for(int i = 0; i < 25; i++) {
    		System.out.println("");
    	         }
    	
    	System.out.println("       There is a funny feeling in the air.....\n" +
    	                   "       the compass is acting strangely and spinning rapidly....\n\n\n" +
    			           "       it would be wise to move to another spot....... ");
                                     
    
        System.out.println("\n\n\n\n");
                 }
        
        
    if(count == 5 && hasBoat == true) {//--- trigger starts 2nd part of boat problem
    	Scanner choice2 = new Scanner(System.in);
    	char h;
    	
    	for(int i = 0; i < 35; i ++) {
    		System.out.println("");
    	       }
    	
    	System.out.println("       NEAR BY CENTRAL SQUARE TECH ENCOUNTERED A MALFUNCTION WITH THEIR MINI LARGE HADRON PARTICLE COLLIDER \n" +
    	                   "       THE ELCTORMAGNETIC DISTURBANCE HAS RENDERED YOUR VESSEL UN MANEURAVABLE. \n" +
    			           "       IN ORDER TO SAVE YOUR VESSEL YOU MUST ENTER THE SQUARE ROOT OF -1 ");
    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
    	
    	h = choice2.next().toLowerCase().charAt(0);
    	
    	if (h == 'i') {
    		System.out.println("       correct     ooooooooooo     oooooooooo   dddd ");
    		System.out.println("       o          o           o   o          o  d   d");
    		System.out.println("       r          o           o   o          o  d    d");
    		System.out.println("       r          o           o   o          o  d    d");
    		System.out.println("       e          o           o   o          o  d    d ");
    		System.out.println("       c    gg    o           o   o          o  d    d");
    		System.out.println("       t     g    o           o   o          o  d   d");
    		System.out.println("       correct     ooooooooooo     oooooooooo   dddd ");
    		System.out.println("\n\n\n\n");
    		}else{
    			   
    			   Boat Boatsink = new Boat() {//---- overrides boat thread and creates sinking effect
    				@Override
    				public void run() {
    					
    					for(int i=0; i<20; i++) {
    					    System.out.println("");
    				             }
    					
    					System.out.println("                  WRONG ANSWER!!!!!!!!!!!!!!!!");
    					System.out.println("\n"+"\n"+"\n"+"\n");
    					System.out.println("   ********" );
    					System.out.println("   *   60  *                                 ]\\");
    					System.out.println("   **********________________________________] \\____________________.");
    					System.out.println("    * *      |                                      Central Power   /");
    					System.out.println("    * *      |                                                     /");
    					System.out.println("    * *      |                                                    /");
    					System.out.println("   @* *      |___________________________________________________/");
    					System.out.println("  @ @**");
    					System.out.println("");
    					System.out.println("");
    					
    					try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					
    					for(int i=0; i<13; i++) {
    					    System.out.println("");
    				             }
    					
    					System.out.println("                  ");
    					System.out.println("\n"+"\n"+"\n"+"\n");
    					System.out.println("   ****" );
    					System.out.println("   *   60  *                                 ]\\");
    					System.out.println("   ******___________  _____________________] \\____________________.");
    					System.out.println("    * *      |                                      Centr   al Power   /");
    					System.out.println("    * *      |                                                     /");
    					System.out.println("    * *      |                                                    /");
    					System.out.println("   @* *      |______________   _____________   ________________________/");
    					System.out.println("  @ @**");
    					System.out.println("");
    					System.out.println("");
    					
    					try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					
    					for(int i=0; i<13; i++) {
    					    System.out.println("");
    				             }
    					
    					System.out.println("                  ");
    					System.out.println("\n"+"\n"+"\n"+"\n");
    					System.out.println("   ****" );
    					System.out.println("   *   60  *                                 ]\\");
    					System.out.println("  ***_______________.");
    					System.out.println("    *    |                            /");
    					System.out.println("    * *      |                                                     /");
    					System.out.println("          |                                                    /");
    					System.out.println("         |___________________/");
    					System.out.println("  @ **");
    					System.out.println("");
    					System.out.println("");
    					
    					try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					
    					for(int i=0; i<23; i++) {
    					    System.out.println("");
    				             }
    					
    					System.out.println("                  ");
    					System.out.println("\n"+"\n"+"\n"+"\n");
    					System.out.println("    .        .          .        .    .          .     . " );
    					System.out.println("      .   .        .      .      .         .       .    .    . ");
    					System.out.println("  .   .      .      .       .       .        .     .          .   . ");
    					System.out.println("     .   YOUR BOAT DISINEGRATED  !!!!!!!!!!!!!!!!!!!!!    .   . . ");
    					System.out.println("         .   .         AND YOU LOST ALL YOUR CATCH      .    .  .");
    					System.out.println("      .          .      .       .       .        .      .  ");
    					System.out.println("        .      .     .       .      .       .        .  ");
    					System.out.println("          .      .        .     .      .    . ");
    					System.out.println("");
    					System.out.println("");	
    				      }// --- closes the override run()
    				    
    			        };// --- closes the boat object
    			        
    			        Boatsink.run();
    			        count = 0;
    			        super.setCatch(0,0,0,0);//--- catch set back to 0
    			        hasBoat = false;
    			        super.getCatch();
    		             }//--- closes else
    	
    	                }//----- closes 2nd trigger
    
    
   
     
       
    System.out.println("");
    System.out.println("");
    System.out.println("  enter 1: to cast again:\n" + "  enter 2: to move to John's pond\n" + "  enter 3: to move to Assawampsett pond\n" + "  enter 4: to quit");
	
	
	
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
	 
	}// closes while enviroment
	
	if(hasBoat==false) {
		 super.walk();
	       }else {
	    	   steam();
	       }
	
	Johns j = new Johns();
	AssaWampsett wamp = new AssaWampsett();
	
	switch(c) {
	 case 2:

	    j.TryJohns();
		break;
		
	 case 3:
		wamp.TryAssaWampsett();
		break;
	     }
	
}//closes try method enviroment




//---------------------------- fish images---------


public void nothing(){
	
	for(int i=0; i < 25; i++) {
		System.out.println("");
	          }
	
	System.out.println("       You Caught the binary value of nothing");
    System.out.println("\n"+"\n"+"\n"+"\n"+"\n\n\n\n");
    System.out.println("   01101110  " + "01101111  " + "01110100  " + "01101000  "+ "\n" +
                       "   01101001  " + "01101110  " + "01100111\n\n\n\n\n");
                         }


public void tri() {
	
	for(int i=0; i < 25; i++) {
		System.out.println("");   
	      }
	
	System.out.println("You caught a pointed triangle fish. Rare but not uncommon to these lucid waters.....");
	
	for(int i=0; i <2; i++) {
		System.out.println("");   
	      }
	
	System.out.println("    *");
	System.out.println("    **");
	System.out.println("    ***");
	System.out.println("    ****");
	System.out.println("    *****");
	System.out.println("    ******");
	System.out.println("    ********");
	System.out.println("    *********");
	System.out.println("    **********");
	System.out.println("    ***********");
	System.out.println("    **********");
	System.out.println("    *********");
	System.out.println("    ********");
	System.out.println("    *******");
	System.out.println("    ******");
	System.out.println("    ****");
	System.out.println("    ***");
	System.out.println("    **");
	System.out.println("    *\n\n");
       }

 public void octal() {
	 
	 for(int i=0; i < 21; i++) {
			System.out.println("");
		          }
	 
	 System.out.println("    WOW You caught a 30 inch OCTAL FISH  which is only 24 decimal inches!\n\n"+
	                    "    You can not eat this fish. It can only feed your mind!\n\n\n\n\n\n\n\n");
	 
	 System.out.println("Octal Based Counting  \n\n"+
			            "  1  2  3  4  5  6  7  10\n"+
	                    "  11 12 13 14 15 16 17 20\n"+
			            "  21 22 23 24 25 26 27 30\n\n\n");
	 
	 }
	
}

