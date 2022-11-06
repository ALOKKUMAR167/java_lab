import java.util.*;

public class constructor_over{
	int id;
	String name;

   constructor_over(){
System.out.println("Default Constructor\n");
   }

constructor_over(int i,String j){
	id = i;
	name = j;
}

public static void main(String [] args){
	constructor_over c1 = new constructor_over();
	System.out.println("ID"+c1.id+"NAME"+c1.name);
	
	constructor_over c2 = new constructor_over(10,"LOL");
	System.out.println("ID"+c2.id+"NAME"+c2.name);
}
}