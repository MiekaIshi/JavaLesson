package practics07;

public class Ex07 {

	public static void main(String[] args) {
		
		for ( int i = 10000 ; i < 10100 ; i++) {
			if(prime(i) != 0) {
				System.out.println(prime(i));	
			}
		}
	}

	public static int prime(int num) {
		for (int i = 2; i <= (num / 2); i++) {
			if ((num % i) == 0) {
				return 0;
			}
		}
		//System.out.println("素数");
		return num;

	}

}
