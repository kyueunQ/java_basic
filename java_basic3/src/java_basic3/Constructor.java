package java_basic3;

public class Constructor {
	
	public int a;
	public int b;
	// global variable
	
	public Constructor(String s, int[] arr) {
		System.out.println("--call the constructor--");
	
		System.out.println("s : " + s);
		System.out.println("arr: " + arr);
	
	}
	
	public Constructor(int a, int b) {
		// local variable: remain for a moment to pass values to main method's parameters
		// after creating object local variables, they disappear in the memory
		
		this.a = a;  // this.= point this class' global variable
		this.b = b;
	
	}
	
	public void getInfo() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
	
