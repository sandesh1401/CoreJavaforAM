package operatorspack;

public class ArithmaticOperatorsDemo {

	public static void main(String[] args) {
//operater = Nothing but symbol in java programs and used to performing operation on given data or operands.
//example is +,-,>,<, 5+3 means 5&3 =operands ,+=operator
		
		int a = 5, b = 2;
		
		System.out.println(a+b); //addition operator
		System.out.println(a-b); //subtraction operator
		System.out.println(a*b); //multiplication operator
		System.out.println(a/b); //division operator
		System.out.println(a%b); //1 // Modulus operator 5/2=2.5 then 2.5-2=0.5 then 0.5*2=1
		
		int c = 6, d = 9;
		// increment operator or Unary operator two types pre and post increment operator.
		
		System.out.println(c); // post increment
		System.out.println(c++);  
		System.out.println(c); 
		
		System.out.println(d); 
		System.out.println(d++); 
		System.out.println(d); 
		
		int e = 3, f = 7;
		
		System.out.println(e); // pre increment
		System.out.println(++e); 
		System.out.println(e); 
		
		System.out.println(f);  
		System.out.println(++f); 
		System.out.println(f); 
		
		int g = 4, h = 8;
		// decrement operator or Unary operator two types pre and post decrement operator
		
		System.out.println(g); // post decrement
		System.out.println(g--); 
		System.out.println(g);
		
		System.out.println(h); 
		System.out.println(h--); 
		System.out.println(h); 
		
		int i = 2, j = 5;
		
		System.out.println(i); // pre decrement
		System.out.println(--i); 
		System.out.println(i); 
		
		System.out.println(j); // 
		System.out.println(--j); 
		System.out.println(j); 

	}

}
