package zock_2019;

public class TestVertex {
	
	public static void main(String[]args){

		Vertex v1 = new Vertex (7,3);
		System.out.println(v1);
		System.out.println(v1.length());
		
		Vertex v2 = v1.skalarMult(5);			
		System.out.println(v2);
		
		v1.addMod(v2);
		System.out.println(v1);
		
		Vertex v3 = v1.add(v2);
			
		System.out.println(v3);

		System.out.println(v1.length());
		

	}

	}
