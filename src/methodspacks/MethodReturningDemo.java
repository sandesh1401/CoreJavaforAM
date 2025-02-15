package methodspacks;

public class MethodReturningDemo {

	public static void main(String[] args) {
		int s = addThreeNumbers(1, 2, 3);
		System.out.println(s);

		//System.out.println(addThreeNumbers(1, 2, 3));

	}

	public static int addThreeNumbers(int a, int b, int c) {
        //using as any data type such as int,double,char,boolean etc.
		//it is returning the value that why we use a datatype in returnig method.
		int sum;//sum-s
		sum = a + b + c;

		return sum;

	}

}
