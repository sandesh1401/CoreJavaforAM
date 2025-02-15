package flowcontrolstatement.selectionstatement;

public class SwitchCaseDemo {
	
// It is not condition based ,It has choosen type to what you want to in this items but is not there so show the default option to you
	
	public static void main(String[] args) {
		
		
				
		       //String foodItem = "pasta";
				//String foodItem = "pizza";
				String foodItem = "noodles";
				//String foodItem = "sandwitch";
			    //String foodItem = "donut";
				
			
				// string - it is predefined class
				
				switch(foodItem) {

					case "pizza":
						System.out.println("Here is your Pizza.");
						break;
					case "noodles":
						System.out.println("Here are your noodles.");
						break;
					case "pasta":
						System.out.println("Here is your pasta.");
						break;
					case "sandwitch":
						System.out.println("Here is your sandwitch");
						break;
					default:
						System.out.println("We only serve pizza/pasta/noodles/sandwitch.");
// java keyword =switch ,case, break, default.
				}
				
				
		// just example but is very clamy type
				
////				if(foodItem.equals("pizza")) {
////					System.out.println("Here is your pizza");
////				}else if(foodItem.equals("noodles")) {
////					System.out.println("Here are your noodles");
////				}else if(foodItem.equals("pasta")) {
////					System.out.println("Here is your pasta");
////				}else if(foodItem.equals("sandwitch")) {
////					System.out.println("Here is your sandwitch");
////				}else {
////					System.out.println("We only server pizza/pasta/noodles/sandwitch");
//				}
				
				System.out.println("End of this program.");
  
	
  
	}

}
