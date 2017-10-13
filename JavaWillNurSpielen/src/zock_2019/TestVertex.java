package zock_2019;

public class TestVertex {
	
	public static void main(String[]args){

		Vertex v1 = new Vertex (4,76);
		System.out.println(v1);

		v1.normalize();
		System.out.println(v1);
		System.out.println(v1.getX()+v1.getY());
		

	}

	}
