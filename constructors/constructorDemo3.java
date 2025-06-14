//program to demonstrate default constructors

class Box{
	int h, w, d;
	
	Box(){
		h=10;
		w=10;
		d=10;
	}
	
	int volume(){
		return (h*w*d);
	}
}

class constructorDemo3{
	public static void main(String args[]){
		Box b1= new Box();
		int v= b1.volume();
		
		System.out.println("Volume of box_1= " +v);
		
		Box b2= new Box();
		v= b2.volume();
		
		System.out.println("Volume of box_2= " +v);
	}
}