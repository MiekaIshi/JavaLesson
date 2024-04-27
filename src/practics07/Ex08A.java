package practics07;

public class Ex08A {

	public static void main(String[] args) {

		//System.out.println( args[0]);
		
		//1行目
		for(int i = 0 ; i < args[0].length() + 4 ; i++){
			System.out.print("+");
		}
		System.out.println("");
		
		//2行目
		System.out.println("+ "+ args[0] +" +");
		
		//3行目
				for(int i = 0 ; i < args[0].length() + 4 ; i++){
					System.out.print("+");
				}
				System.out.println("");	
	}

}
