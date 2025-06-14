//program to demonstrate that a superclass variable can be a reference for a subclass object

class Box{
	int h, w, d;
	
	Box( Box ob){
		h= ob.h;
		w= ob.w;
		d= ob.d;
	}
	Box(){
		h=w=d=-1;
	}
	Box(int ht, int wd, int dp){
		h=ht;
		w=wd;
		d=dp;
	}
    Box(int len){
		h=w=d= len;
	}
	
	void volume(){
		System.out.println("Volume of box= "+ (h*w*d));
	}
}


class BoxWeight extends Box{
	int boxwt;
	BoxWeight(int ht, int wd, int dp, int wt){
		h=ht;
		w=wd;
		d=dp;
		boxwt= wt;
	}
}

class SuperClassReferenceDemo{
	public static void main(String args[]){
		BoxWeight bw= new BoxWeight(5,10,15,18);
		Box b1= new Box();
		bw.volume();
		
		System.out.println("Weight of box= " + bw.boxwt);
		b1= bw;
		b1.volume();
		//System.out.println("Weight of plain box= " + b1.boxwt);
	}
}

		
