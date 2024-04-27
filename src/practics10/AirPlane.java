package practics10;

public abstract class AirPlane {
	private String type ;

	public AirPlane(String type) {
		this.type = type ;

	}
	
	 public String getType(){
	        return type ;
	    }
	
	public abstract void fly() ;

}
