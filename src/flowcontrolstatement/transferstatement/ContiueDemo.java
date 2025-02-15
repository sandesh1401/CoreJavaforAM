package flowcontrolstatement.transferstatement;

public class ContiueDemo {
//it is not used real time just for understand.
	public static void main(String[] args) {

		for(int i=1;i<=10;i++) 
		//for(int i=10;i>0;i--)
		{
			
			if(i==5) {
				continue;// when condition true on that time then it is cancel and continue to next.
			}
			
			System.out.println(i);  // 1 2 3 4 6 7 8 9 10  
			
		}
		
		System.out.println("End of this program");
	}

}
