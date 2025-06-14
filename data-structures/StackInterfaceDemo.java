//implementation of stack using interface in java

interface intStack{
	void push(int item);
	int pop();
}

class FixedStack implements intStack{
	private int stck[];
	private int tos;         //top of stack
	
	FixedStack(int size){
		stck= new int[size];
		tos=-1;
	}
	
	public void push(int item){
		if(tos==stck.length-1)
			System.out.println("Stack is full...");
		else
			stck[++tos]= item;
	}
	
	public int pop(){
		if(tos<0){
			System.out.println("Stack is empty...");
		return 0;
		}
		else
		     return stck[tos--];
	}
}

class StackInterfaceDemo{
	public static void main(String args[]){
		FixedStack mystck1= new FixedStack(5);
		FixedStack mystck2= new FixedStack(10);
		
		for(int i=0; i<5; i++)
			mystck1.push(i);
			
		for(int i=0; i<10; i++)
            mystck2.push(i);

    System.out.println("Elements in the stack are: ");
        
        for(int i=0; i<5; i++)
             mystck1.pop();

        for(int i=0; i<10; i++)
            System.out.println(mystck2.pop());
		}
}