
public class Walking extends Thread{

	
	public void run() {
		for(int v = 0; v <24; v++) {
			System.out.println("");
		}
		
		stick();// = stick figure walking
		
		
		for(int i= 0; i <32; i++ ) {
			System.out.println("");
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
	
	public void stick() {
		System.out.println("         O  /");
		System.out.println("        /|"+"\\"+"/");
		System.out.println("       {}|/");
		System.out.println("        /-\\");
	}
}