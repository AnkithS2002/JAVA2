class Q{
	int n;
	boolean valueset = false;
	synchronized void get(){
		while(!valueset)
			try{		
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception");
			}

			System.out.println("Client: Tq, I received token "+n);
			valueset=false;
			notify();
	}

	synchronized void put(int n){
		while(valueset)
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception catched");
			}
			this.n=n;
			System.out.println("Receptionist: Take token number "+n);
			valueset=true;
			notify();
	}
}

class Producer implements Runnable{
	Q q;
	int i=0;
	Producer(Q q){
		this.q=q;
		new Thread(this,"Producer").start();
	}

	public void run(){
		for(int j=0;j<10;j++){
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{
	Q q;
	Consumer(Q q){
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run(){

		for(int j=0;j<10;j++){
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class PCfixed{
	public static void  main(String args[]){
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press control-c to exit");
	}
}