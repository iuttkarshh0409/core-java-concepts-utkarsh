//program to demonstrate method overloading
class OverloadDemo{
	void test(){
		System.out.println("Method with no arguements...");
	}
	
	void test(int a){
		System.out.println("Value of a= " +a);
	}
	
	void test(int a, int b){
		System.out.println("Value of a and b are " + a + " and " + b);
    }

    double test(double i){
        System.out.println("Value of i= " +i);
		return i*i;
    }
}

class MethodOverloadingDemo{
    public static void main(String args[]){
        OverloadDemo o1= new OverloadDemo();
            o1.test();
            o1.test(5);
            o1.test(5,10);
            
            double d= o1.test(10.5);
            System.out.println("Value of d= " +d);
	}
}	
		