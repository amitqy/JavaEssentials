public class PrimitiveVsReferenceTypes {
    public static void main(String[] args) {
        int a = 10;
        // value of a which is 10 is copied to b
        int b = a;
        a = 100;
        // after we change a to 100, b remains untouched
        // because b is in different memory location
        System.out.println("a: " + a + " b:  " + b );

        // alex is a reference type
        Person alex = new Person("alex");
        // mariam is also a reference type, now pointing to alex's reference
        Person mariam = alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);
        alex.name = "Alexander";
        System.out.println("after changing alex");
        // same name because they are pointing to same reference
        System.out.println(alex.name + " " + mariam.name);
        mariam.name ="Mariam";
        // again same name because they a re pointing to same reference
        System.out.println(alex.name + " " + mariam.name);


    }

    static class Person{
        String name;
        Person(String name){
            this.name=name;
        }
    }
}
