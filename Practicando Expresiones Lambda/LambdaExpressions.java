// Interfaces can be of different type depending on how many methods it has where you can have multiple 
// abstract methods, in that case it become a normal interface. Whereas, an interface with a single abstract
// method is called a functional interface.

// You cannot initialize an interface as an object, but you can initialize the implementation of an interface
// as a class.

@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("Hi");
//     }
// }
public class LambdaExpressions{
    //public static void main(){
      //  A object = new B();
      //  object.show();
    //}
    // This is what is called an inner anonymous class, because it is a class without a name, and it is
    // within a clas itself, that's why it's inner. In this class, we can define the method like we did above.
    // public static void main(String[] args){
    //     A obj = new A() {
    //         public void show(){
    //             System.out.println("Hi");
    //         }
    //     };
    //     obj.show();
    // }
    
    
    // The above can be replaced with what is called a lambda expression in the following way.
    // public static void main(String[] args){
    //     A obj = () ->
    //     {
    //         System.out.println("Hi");
    //     };
    //     obj.show(); 
    // }
    
    
}