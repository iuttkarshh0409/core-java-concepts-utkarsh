//program to demonstrate inheritance

class A{
	int i, j;
	void Showij(){
		System.out.println("Value of i and j are " +i + " and " + j);
	}
}

class B extends A{
	int k;
	void Showk(){
		int sum= i+j+k;
		System.out.println("Sum of i, j and k= " + sum);
	}
}

class InheritanceDemo2{
	public static void main(String args[]){
		
		A a= new A();
		a.i= 10;
		a.j= 10;
		a.Showij();
		
		B b= new B();
		b.i= 5;
		b.j= 6;
		b.k= 7;
		b.Showij();
		b.Showk();
	}
}
