public class Yummy {
    public static void main(String [] args){
 System.out.println( "Yummy");
 chocolate();       //call the chocolate method
 icecream();
 System.out.println("done");
    }
    
    public static void chocolate(){
System.out.print("Chocolate");
System.out.println("Cake");
    }
    public static void frenchfries(){
        System.out.println( "french fries with ketchup");
        chocolate();
        System.out.println( "that was yummy");
    }
public static void icecream(){
System.out.println("ice");
frenchfries();
System.out.println("cream");
}
}

