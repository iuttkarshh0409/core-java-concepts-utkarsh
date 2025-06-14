//program to demonstrate dynamic binding

class A{
	void callme(){
		System.out.println("Inside A's method");
	}
}

class B extends A{
	void callme(){
		System.out.println("Inside B's method");
	}
}

class C extends A{
	void callme(){
		System.out.println("Inside C's method");
	}
}

class dynamicBindingDemo{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		C c = new C();
		
		A r;         //reference variable
		r=a;
		r.callme();
		r=b;
		r.callme();
		r=c;
		r.callme();
	}
}
		