package operatorspack;

public class ArithmaticVariationDemo {

	public static void main(String[] args) {
		
		int a = 5, b = 3;
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		
		// increment and decrement operator
		
		//a=5 then a++ =5 means h=5 then post increment 5++1=6 then a=6 
		//then next ++a is pre increment but now a is 6 1++6=7 then i=7 means a=7 finally got a=7  
		int h = a++;
		int i = ++a;
		//b=3 then b-- =3 means j=3 then post decrement 3--1=2 then b=2 
		//then next --b is pre increment but now b is 2 1--2=1 then k=1 means b=1 finally got b=1
		int j = b--;
		int k = --b;
		
		System.out.println(a);  // 7  
		System.out.println(b);  // 1
		System.out.println(c);  // 8
		System.out.println(d);  // 2
		System.out.println(e);  // 15
		System.out.println(f);  // 1
		System.out.println(g);  // 2
		System.out.println(h);  // 5 
		System.out.println(i);  // 7
		System.out.println(j);  // 3
		System.out.println(k);  // 1
	}

}
