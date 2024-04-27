package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13 {
	public static void main(String[] args) throws IOException {
		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("月を数字で入力：");
	int month = Integer.parseInt(br.readLine());
	
	switch(month){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	    System.out.println("31日まで");
	    break;
	    
	    
	  case 2:	  
	    System.out.println("28日まで");
	    break;
	    
	  case 4:
	  case 6:
	  case 9:
	  case 11:
		  System.out.println("30日まで");
		    break;
		    
		    default:
			System.out.print("やり直してください");
			break;
		  
		  
	}
	}
}
