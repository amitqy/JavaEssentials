import java.util.ArrayList;
import java.util.List;

public class StaticKeyword {
    // This function has to be static
    // if we remove static, there is no
    // way run it
    // Static method, or variable belongs to the
    // class itself instead of objects.
    // It is used to represent something
    // that is shared by all the objects

    // We also used static to define constants

    // We also have static block
    // It is used to initialize any static field

    public static  final String BRAND = "Lui Vitton";
    public static String BRAND2;
    static List list;

    static {
        // initializing list
        list = new ArrayList();
        // initializing variable
        BRAND2 = "Gucci";
    }


    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // static method and variable use using
        // class name
        System.out.println(Person.createdPeople);
        // 3
        System.out.println(Person.getCreatedPeople());
        // 3
        // using the constant
        System.out.println(StaticKeyword.BRAND);
    }

   //static so that we can use class inside main
   static class Person{
        static int createdPeople = 0;

       Person(){
           // creating a person and increasing
           createdPeople++;
       }

       public static int getCreatedPeople() {
           return createdPeople;
       }
   }

}
