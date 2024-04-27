package practics07;

public class Ex10 {

	public static void main(String[] args) {
		//System.out.println(fibonacci(5) );
		
		for (int n = 11; n <= 20; n++) {
			System.out.print(fibonacci(n) +",");
		}
		//System.out.println(fibonacci(5) +"メイン");
	}

	static int fibonacci(int n) {
	//System.out.println(n+"nの値");
	if(n ==0){
		return 0;
		}else if( n== 1){
			return 1 ;
	}else{
		return fibonacci(n - 2) + fibonacci(n - 1);	
	}
	
}

}
