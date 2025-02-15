package variablestypespack;

public class LocalGlobalVariablesDemo {

	static int a = 10; // global variable
	static int b = 20; // global variable
	static int c = 30; // global variable
	//Global Variables= A Variable that is directly created under a class and outside the methods .
	
	
	public static void main(String[] args) {
	//Local Variables= A Variable which is created inside the Main methods.
		 
		int m = 5; // local variable
		int n = 6; // local variable
		int p = 7; // local variable
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
	}
	
	public static void sample() {
		
//		System.out.println(m); //local 
//		System.out.println(n);
//		System.out.println(p);
		System.out.println(a);//global
		System.out.println(b);
		System.out.println(c);
		
		
		
	}

}
