
public abstract class FishingAction {
	static boolean hasBoat=false;
	static int sunfish;
	static int trout;
	static int bass;
	static int totalcatch;
	 
	
	
	
	
	 public void setCatch(int s, int t, int b, int tc){        //---------- updates catch
		 sunfish += s;
		 trout += t;
		 bass += b;
		 totalcatch += tc;
		 
		 if(s==0 && t==0 && b==0 && tc==0){
			 sunfish = 0;
			 trout = 0;
			 bass = 0; 
			 totalcatch = 0;
		      }
	        }
	
	
	
	
	public void getCatch() {     //---------prints catch status
		
		System.out.println("You caught: "+"\n"+ sunfish + " sunfish\n" + trout + " trout\n"+ bass + " bass\n"+ "totalcatch = "+ totalcatch );
	}

	
	
	public void sunfish() {//-------- super call to sunfish method
		
		Johns fish = new Johns();
		fish.Sunfish();
		
	}
	

	

    public void Nada() {
    	System.out.println("\n"+"\n"+"\n" +"\n"+"\n"+"\n"+"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
    	System.out.println("  YOU CAUGHT NADA!!!!!");
    	System.out.println("\n");
    	System.out.println("       |||||||||||||||||");
    	System.out.println("       *****************");
    	System.out.println("      *                 *");
    	System.out.println("     *    @         @    *");
    	System.out.println("     *                   *");
    	System.out.println("     *         >          *");
    	System.out.println("     *                   *");
    	System.out.println("     *  ^v^v^v^v^v^v^v^  *");
    	System.out.println("      * ^             ^ *");
    	System.out.println("       *               *");
    	System.out.println("         *************");
    	System.out.println("\n"+"\n"+"\n" +"\n"+"\n");
    }


public void getBoat() {//------------ displays when player gets boat
	
	Boat boat= new Boat();
	boat.boat();
	   }

public void walk() {//------ walking thread when changing location *****before boat is obtained
	
	Walking stickfigure = new Walking();
	stickfigure.run();
	    }

public void steam() {//-----boat moving thread when changing location ***after boat has been obtained
	Boat boat = new Boat();
	boat.run();
}
}
