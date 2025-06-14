//program to demonstrate default and parametised constructor
class Person{
      String name;
	  int age;
	  
	  //defaul constructor
	  Person(){
		  name= "Unknown";
		  age= 0;
	  }

       //constructor with name only
       Person(String name){
             this.name= name;
             this.age=0;
	   }

       //constructor with name and age
        Person(String name, int age){
             this.name= name;
             this.age= age;
        }

        void displayInfo(){
             System.out.println("Name: " + name + ", Age: " + age);
        }
    }	

public class constructorTypesDemo {
       public static void main (String[] args){
              Person person1= new Person();
              Person person2= new Person("Bobby");
              Person person3= new Person("Charlie Dean", 21);
	   }
}	   