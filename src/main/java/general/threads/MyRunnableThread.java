package general.threads;

public class MyRunnableThread {
	public static void main(String a[]) {
		Thread loop = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					if(Thread.interrupted()) {
						break;
					}
				}
			}
		});
		loop.start();
		loop.interrupt();
	}
}
