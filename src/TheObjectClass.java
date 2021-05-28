import java.awt.*;

public class TheObjectClass {
    public static void main(String[] args) {
        // Object is the root of all objects
        // All classes share methods of object class
        Object name = "amit";
        System.out.println(name);
        // amit
        Object p = new Point();
        //p.x won't work
        //object can't call methods of
        //inside point class, while
        //vice versa is true
    }
}
