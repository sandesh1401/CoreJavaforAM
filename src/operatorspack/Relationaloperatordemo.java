package operatorspack;

public class Relationaloperatordemo {

	public static void main(String[] args) {
		
   int a = 5, b = 4, c = 5, d = 3, e = 7;
		// use boolean data type,example boolean i= a>b;
   
   
		System.out.println(a>b); // true 
		System.out.println(a>c); // false
		System.out.println(a>e); // false
		
		System.out.println(a<b); // false
		System.out.println(a<c); // false
		System.out.println(a<e); // true
		
		System.out.println(a>=b); // true
		System.out.println(a>=c); // true
		System.out.println(a>=e); // false
		
		System.out.println(a<=b); // false
		System.out.println(a<=c); // true
		System.out.println(a<=e); // true
		
		System.out.println(a==b); // false
		System.out.println(a==c); // true
		System.out.println(a==e); // false
		
		System.out.println(a!=b); // true
		System.out.println(a!=c); // false
		System.out.println(a!=e); // true
		
		//! means not equal


	}

}
