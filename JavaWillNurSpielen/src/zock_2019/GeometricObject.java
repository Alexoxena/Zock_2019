package zock_2019;

public class GeometricObject {
	
	public Vertex pos;
	public double width;
	public double height;
	
	public GeometricObject(Vertex pos, double width, double height ){
		
		this.pos=pos;
		this.width=width;
		this.height=height;
				
		if (width<0){
			width=-width;
			pos.x=pos.x-width;
		}
	
		if (height<0){
			height=-height;
			pos.y=pos.y-height;
		}
	}
	
 
	public GeometricObject(double width, double height){   //richtiger Konstrukter wird anhand Parameteranzahl ausgewählt
	 this(new Vertex (0,0), width, height);             /*this bei Konstruktor= benutzt passenden Konstruktor 
	                                                    in dieser Klasse , übergibt Parameter an Konstruktor*/ 
	 }


	public GeometricObject(double width){  //nur noch ein Parameter wird benötigt, wird dann übergeben, am Ursprung
	this(width,width);
	}

	public GeometricObject(){   //übergeben, höhe und breite = 0
	this(10);}


	public GeometricObject (Vertex pos){
	this(pos,0,0);
}

	public String toString(){		
	return "width = " + width +"height= "+ height +"pos = "+pos+"";
}

	public double circumference(){       //Umfang berechnen

		return 2*(width+height);
}

	public double area(){  //Flächeninhalt
		return width*height;
	}


	public boolean contains (Vertex v){ //Überprüft ob sich Vertex in Geometrischen Objekt befindet
	
		return (v.x >= pos.x && v.x <= pos.x + width) &&           //wenn gnzerAusdruch richtig, return true, sonst false
           (v.y >= pos.y && v.y <= pos.y + height);                                                     //this = Ausdruck von geometr. Objekt
} 

	public 	boolean isLargerThan(GeometricObject that){

		return this.area() > that.area();
	}

	public void moveTo(Vertex v){
	this.pos = v;
}


	public void moveTo(double x, double y){
		moveTo(new Vertex (x,y));
	}
public boolean equals (Object thatObject){ //überprüfen ob 2 Objecte gleich sind
	
	if (thatObject instanceof GeometricObject){   //überprüfen ob Geometric Object ist
	
		GeometricObject that= (GeometricObject)thatObject;
	return that.width==this.width &&
		   that.height==this.height &&
		   this.pos.equals(that); 
	
	}
return false;
}

}



