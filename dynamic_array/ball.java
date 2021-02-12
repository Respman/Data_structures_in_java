public class ball implements Comparable<ball>{

	int R;
	String color;

	public ball(){
		super();
	}

	public ball(int R, String color){
		this.R = R;
		this.color = color;
	}
	
	public int compareTo(ball bal){
		return(this.R-bal.R);
	}
	
	public String toString () {
		return("R = " + this.R + " color = " + this.color);
	}
}
