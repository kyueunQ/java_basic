package java_basic3;

public class Refrig {
	
	public String color;
	public int num;
	public int price;
	
	public Refrig() {
		System.out.println("--constructor1--");
	}
	
	public Refrig(String c, int n, int p) {
		System.out.println("--constructor2--");
		this.color = c;
		this.num = n;
		this.price = p;
	}

	public Refrig(int n, int p) {
		System.out.println("--constructor3--");
		this.num = n;
		this.price = p;
	}
	
	
	public String getColor() {
		
		return color;
	}
	
	public void getInfo() {
		System.out.println("--Info--");
		System.out.println("num: " + num);
		System.out.println("price: " + price);
	}
	
	public void habis() {
		System.out.println("--³¡--");
	}
	
}
