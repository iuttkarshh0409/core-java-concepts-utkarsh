 class Box{
      int h,w,d;
	  }
	  
class oopDemo2{
      public static void main(String args[]){
             Box b1= new Box();
             b1.h= 10;
             b1.w= 6;
             b1.d= 5;

             Box b2;
			 b2= new Box();
             b2.h = b2.w = b2.d= 10;			 
        
        int vol1= b1.h * b1.w * b1.d; 
    System.out.println("Volume of Box1= " + vol1);
	
	     int vol2= b2.h * b2.w * b2.d; 
    System.out.println("Volume of Box2= " + vol2);
      
       }
}	   
  