
public class TimeToken implements Runnable{

	Thread t;
	TimeToken(){
		t = new Thread(this, "Token");
		System.out.println("Thread: "+t);
		t.start();
	}

	@Override
	public void run() {
		for(int i = 1; i < 11; i++) {
			System.out.println("Token : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Program over..");
		
	}
	public static void main(String args[]) {
		new TimeToken();
	}
}
