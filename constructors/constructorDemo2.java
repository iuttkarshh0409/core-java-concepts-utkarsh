//program to demonstrate parameterised constructors

class Box{
	int h, w, d;
	
	Box(int i, int j, int k){
		h=i;
		w=j;
		d=k;
	}
	
	int volume(){
		return (h*w*d);
	}
}

class constructorDemo2{
	public static void main(String args[]){
		Box b1= new Box(5,10,15);
		int v= b1.volume();
		
		System.out.println("Volume of box_1= " +v);
		
		Box b2= new Box(3,4,5);
		v= b2.volume();
		
		System.out.println("Volume of box_2= " +v);
	}
}