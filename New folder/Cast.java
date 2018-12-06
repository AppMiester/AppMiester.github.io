
public class Cast extends Thread{
	
public void run(){
	for(int i= 0;i < 9; i++ ) {//----- creates casting effect
		
		if(i<3){
		System.out.println("casting....");
		    }else {
			      System.out.println("reeling...... reeling.... reeling.....");
		            }
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	   
	rod();//---- calls rod image
	
	for(int a = 1; a < 30; a++) {
		System.out.println("                                                    |");//------ line reeling effect
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  }

public void rod(){
System.out.println("");
System.out.println("          ___");
System.out.println("         | + |  ");
System.out.println("=========|_|_|=========0===========0========0=======o");



}





}
