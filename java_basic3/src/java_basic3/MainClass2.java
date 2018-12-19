package java_basic3;

public class MainClass2 {
	
	public static void main(String[] args) {
	
		int[] arr = {1, 2, 3};
		Constructor con = new Constructor("OH", arr);
		// point that array's memory address
	
		Constructor con2 = new Constructor(10, 100);
		con2.getInfo();
	
	}
	

}
