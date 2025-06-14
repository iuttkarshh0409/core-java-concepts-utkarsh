//program to demonstrate inheritance 

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


class InheritanceDemo{
	public static void main(String args[]){
		BoxWeight bw= new BoxWeight(10,20,15,50);
		bw.volume();
		System.out.println("Weight of box= " + bw.boxwt);
	}
}