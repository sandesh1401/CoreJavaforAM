package operatorspack;

public class Logicaloperatordemo {

	public static void main(String[] args) {
		
		// logical and(&&) operator ex ticket and visa both mandatary
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		//logical or operator ex physic or chemetry
		System.out.println(true || true);  // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		//logical not operator ex opposite
		System.out.println(!true); // false 
		System.out.println(!false); // true


	}

}
