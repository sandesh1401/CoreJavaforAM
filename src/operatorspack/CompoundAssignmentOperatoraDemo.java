package operatorspack;

public class CompoundAssignmentOperatoraDemo {

	public static void main(String[] args) {
       int a = 5, b = 4;
		
		a+=b; // a = a + b;
		
		System.out.println(a); // 9
		System.out.println(b); // 4
		
		int c = 15, d = 6;
		
		c-=d; // c=c-d;
		
		System.out.println(c); // 9
		System.out.println(d); // 6
		
		int i = 4, j = 2;
		
		i/=j; // i =i/j i=2 j=2
		i*=j; // i =i*j 2*2 i=4 j=2 
		i%=j; // i=i%j i=0 j=2 
		
		System.out.println(i); // 0
		System.out.println(j); // 2

	}

}
