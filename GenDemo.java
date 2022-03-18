package Generics;

class Ankith<T,V>{
	T ob1;
	V ob2;
	void show() {
		System.out.println("ob1: "+ob1+" type: "+ob1.getClass().getName());
		System.out.println("ob1: "+ob2+" type: "+ob2.getClass().getName());
	}
	public T getOb1() {
		return ob1;
	}
	public void set(T ob1, V ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	public V getOb2() {
		return ob2;
	}
	
}


public class GenDemo {

	public static void main(String[] args) {
		Ankith<String, Integer> student1 = new Ankith<String, Integer>();
		Ankith<String, Integer> student2 = new Ankith<String, Integer>();
		
		student1.set("Ankith S", 17);
		student2.set("Rahul R", 35);
		
		student1.show();
		student2.show();
	}

}
