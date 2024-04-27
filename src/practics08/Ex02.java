package practics08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int kind, sheet;
			
			CoinCase coin = new CoinCase();
			for (int i = 1; i < 11; i++) {
				System.out.println(i +"回目");
				System.out.println("硬貨の種類をを入力");
				kind = Integer.parseInt(br.readLine());
				System.out.println("枚数を入力");
				sheet = Integer.parseInt(br.readLine());

				coin.addCoin(kind, sheet);
			}
			
			//所司している硬貨を表示
			System.out.println("500円が"+ coin.  getCount(500) +"枚");
			System.out.println("100円が"+ coin.  getCount(100) +"枚");
			System.out.println("50円が"  + coin.  getCount(50)   +"枚");
			System.out.println("10円が"  + coin.  getCount(10)   +"枚");
			System.out.println("5円が"    + coin.  getCount(5)     +"枚");
			System.out.println("1円が"    + coin.  getCount(1)     +"枚");
			
			System.out.println(coin. getAmount() +"円あります");
			
			CoinCase coin2 = new CoinCase();
			for (int i = 1; i < 11 ; i++) {
				System.out.println(i +"回目");
				System.out.println("硬貨の種類をを入力");
				kind = Integer.parseInt(br.readLine());
				System.out.println("枚数を入力");
				sheet = Integer.parseInt(br.readLine());

				coin2.addCoin(kind, sheet);
			}
			
				System.out.println("500円が"+ coin2. getCount(500) +"枚、"+ coin2. getAmount(500) +"円分あります");
				System.out.println("100円が"+ coin2. getCount(100) +"枚、"+ coin2. getAmount(100) +"円分あります");
			System.out.println("50円が"      + coin2. getCount(50) +"枚、"+ coin2. getAmount(50) +"円分あります");
				System.out.println("10円が"  + coin2. getCount(10) +"枚、"+ coin2. getAmount(10) +"円分あります");
				System.out.println("5円が"    + coin2. getCount(5) +"枚、"+ coin2. getAmount(5) +"円分あります");
				System.out.println("1円が"    + coin2. getCount(1) +"枚、"+ coin2. getAmount(1) +"円分あります");
			
				System.out.println("硬貨が全部で"+ coin2.getCount() +"枚あります");
				System.out.println("全部で"+ coin2.getAmount() +"円あります");
				
			
			
			
			
			
			
		}

	}

}
