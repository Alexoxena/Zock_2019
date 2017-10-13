package zock_2019;

public class Vertex {
	public double x;
	public double y;

	public Vertex (double x, double y){
	this.x = x; //this = eigene Variable, ohne this= fremde
	this.y = y;		
	}
	
	public String toString(){		
		return "("+x+","+y+")";
	}

	public double length(){
		return Math.sqrt(x*x + y * y );
	}

	public Vertex skalarMult(double s){
		return new Vertex (x*s, y*s);
	}
	
	public void skalarMultMod(double s){
		x=x*s;
		y=y*s;	
	}

	public Vertex add(Vertex v){	
		return new Vertex (v.x+x, v.y+y);
	}


	public void addMod(Vertex v){	
		x=x+v.x;	
		y=y+v.y;
	}

	public Vertex sub(Vertex v){		
		return new Vertex (v.x-x, v.y-y);
	}


	public void subMod(Vertex v){	
		x=x-v.x;
		y=y-v.y;
	}
	
	public void setzeX (double x){	
		this.x=x;
	}

	public void setzeY(double y){
		this.y=y;
	}


	public double getX(){	
		return x;
	}
	

	public double getY(){	
		return y;
	}

	public boolean equals (Object thatObject){
	
		if (thatObject instanceof Vertex){
			Vertex that = (Vertex) thatObject; //Klammern = Cast , macht für Compiler klar, das thatObject Vertex ist
			return this.x == that.x && this.y == that.y;
		}
		
		return false;//nach return wird abgebrochen, d.h wenn true Methode zuende
	
	}
		
	public double distance (Vertex v){
			double xx = this.x-v.x;
			double yy = this.y-v.y;
			
		return Math.sqrt(xx*xx+yy*yy);
		}
		
		public void normalize(){
			double factor =length();
			x=x/factor;
			y=y/factor;			
		}
	
}	
