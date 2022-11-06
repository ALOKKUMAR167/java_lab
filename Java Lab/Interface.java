import java.util.*;

class Interface{  
public static void main(String args[]){  
Drawable d=new Rectangle();
d.draw();  
}} 

interface Drawable{  
void draw();  
}  

class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
 
