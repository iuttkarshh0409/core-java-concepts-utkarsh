//program to demonstrate abstract class

abstract class Figure{
	int dim1,dim2;
	
	Figure(int a, int b){
		dim1=a;
		dim2=b;
	}
	
	abstract void area();
}

class Triangle extends Figure{
	Triangle (int a, int b){
		super(a,b);
	}
	
	void area(){
		int ar= (dim1*dim2)/2;
		System.out.println("Area of Triangle= " + ar);
	}
}

class Rectangle extends Figure{
	Rectangle(int a, int b){
		super(a,b);
	}
	void area(){
		System.out.println("Area of Rectangle= " + (dim1*dim2) );
	}
}

class AbstractClassDemo{
	public static void main(String args[]){
		Figure f;
		Triangle t= new Triangle(10,20);
		Rectangle r= new Rectangle(10,15);
		f=t;
		f.area();
		f=r;
		f.area();
	}
}
