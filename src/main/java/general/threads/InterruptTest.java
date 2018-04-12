package threads;

public class InterruptTest {
	public static void main(String a[]) {
		for (int i = 0; i < 3; i++) {
		    // Pause for 2 seconds
		    try {
		        Thread.sleep(2000);
		        throw new InterruptedException();
		    } catch (InterruptedException e) {
		    		System.out.println("InterruptedException");
		    		// We've been interrupted: no more messages.
		        //return;
		    }
		    // Print a message
		    System.out.println(i);
		}	
	}
}
