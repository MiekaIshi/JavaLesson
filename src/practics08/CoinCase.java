package practics08;

public class CoinCase {
	private int yen500 = 0 ;
	private int yen100 = 0 ;
	private int yen50   = 0 ;
	private int yen10   = 0 ;
	private int yen5     = 0 ;
	private int yen1     = 0 ;

	public void addCoin(int kind, int sheets) {
		switch (kind) {
		case 500:
			this.yen500 += sheets;
			break;

		case 100:
			this.yen100 += sheets;
			break;

		case 50:
			this.yen50 += sheets;
			break;

		case 10:
			this.yen10 += sheets;
			break;

		case 5:
			this.yen5 += sheets;
			break;

		case 1:
			this.yen1 += sheets;
			break;
			default:
				break ;
		}
		//System.out.println(this.yen50);
	}

	public int getCount(int kind) {
		//return kind;
		
		switch (kind) {
		case 500:
			return this.yen500 ;

		case 100:
			return this.yen100 ;

		case 50:
			return this.yen50 ;

		case 10:
			return this.yen10 ;

		case 5:
			return this.yen5 ;
			
		case 1:
			return this.yen1 ;	
			default:
				return 0 ;
		}
	}
	
	public int getAmount() {
	return  (this.yen500 * 500) + (this.yen100 * 100) +  (this.yen50 * 50) +  (this.yen10 * 10) +  (this.yen5 * 5) +  (this.yen1 * 1) ;
	}
	
	public int getCount() {
	return  this.yen500 + this.yen100 + this.yen50 +  this.yen10 +  this.yen5 + this.yen1 ;
	}
	public int getAmount(int kind) {
		return getCount(kind) * kind ;
	}
	
}
