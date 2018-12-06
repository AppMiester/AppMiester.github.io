import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Johns extends FishingAction {
	
	int x;
	int c;
	
	
public void TryJohns() {
	

	Cast rod = new Cast();
	
	while(true) {//----- main loop for enviroment
    
		System.out.println("                               JOHNS POND");
		
	    rod.run();
   
	Random rand= new Random();
    x=rand.nextInt(6);
    
    if(x<=3) {
    	System.out.println("You caught a sun fish");
    	Sunfish();
          }
     
    if(x==4){
    	Boot();
         }  
       
     if(totalcatch==3 && hasBoat== false){//----- method to trigger boat
    	super.getBoat();
    	hasBoat= true;
          } 
    
     if(x>4){
       super.Nada();
            }
  
    System.out.println("\n\n ");
    
    System.out.println("  enter 1: to cast again:\n" + "  enter 2: to move to Assawompset pond\n" + "  enter 3: to move to Van's Abyss\n"+ "  enter 4: to quit");
	
	
	
	
while(true) {   //question check****
	    
		
     while(true) {    // checks input *******************
			
	
	     try {
  
				@SuppressWarnings("resource")
				Scanner choice = new Scanner(System.in);	
                c = choice.nextInt();
                    
  
	      }catch(InputMismatchException e) {
		      System.out.println("error wrong data type");
		      System.out.println("enter 1 2 3 pr 4");
		      continue;
		            }
			
			
			if(c==1 || c== 2|| c==3 || c==4) {
			    break;
			      }
			
			if(c != 1 && c != 2 && c != 3 &&  c !=4) {
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
	}//closes while loop enviroment
	
	if(hasBoat==false) {//walking / boat movement
		 super.walk();
	        }else {
	        	super.steam();
	        }
	
	
	AssaWampsett a = new AssaWampsett();
	VansAbyss v = new VansAbyss();
	
	switch(c) {
	
	 case 2:
		
		a.TryAssaWampsett();
		break;
		
	 case 3:
		v.TryVansAbyss();
	}
}// closes try method




// ************** fish drawings
public void Sunfish() {
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("  You Caught a sunfish!!" + "\n" + "\n"+ "\n" + "\n"+"\n"+"\n"+"\n");
	System.out.println("     *   ***");
	System.out.println("     ******O**");
	System.out.println("     *  *****");
	System.out.println("\n\n\n");
	super.setCatch(1, 0, 0, 1);
	super.getCatch();
	System.out.println("\n\n\n");
	     }

public void Boot() {
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
	System.out.println("  You caught an old boot !!!");
	System.out.println("\n"+ "\n"+"\n"+"\n");
	System.out.println("     BBBBBBB");
	System.out.println("     BBBBBBB");
	System.out.println("     BBBBBBB");
	System.out.println("     BBBBBBBB");
	System.out.println("     BBBBBBBBBBBB");
	System.out.println("     BBBBBBBBBBBBB");
	System.out.println("     BBBBBBBBBBBB");
	System.out.print("\n"+"\n"+"\n"+"\n");
       }

}
