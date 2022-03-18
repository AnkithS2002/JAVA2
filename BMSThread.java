package multithreading;

class BMSDemo implements Runnable{
	
	Thread t;
	int x;
	int time;
	String name;
	
	BMSDemo(String name, int time, int x){
		this.name = name;
		this.x = x;
		this.time = time;
		t = new Thread(this, name);
		t.start();
	}
	
	public void run() {
		try {
			for(int i = x; i > 0; i--) {
				System.out.println(name);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted "+name);
		}
	}
}


public class BMSThread {

	public static void main(String[] args) {
		new BMSDemo("BMS College of Engineering", 10000, 2);
		new BMSDemo("CSE", 2000, 10);
		
		

	}

}
