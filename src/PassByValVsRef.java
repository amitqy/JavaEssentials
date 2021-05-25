import java.awt.*;

public class PassByValVsRef {
    public static void main(String[] args) {

        /**
         * When being passed to a function, a primitive is not mutated
         * while a non-primitive is mutated
         */
        int x = 0;
        incrementValue(x);
        // Output is still zero, because a primitive is passed by value
        // It just passes a copy not the original x
        // after the method call is delete the incremented value which
        // is a copy got deleted
        System.out.println(x);

        Point point = new Point(100,100);
        // Reference types are passed by reference
        // so original passed value is also mutated
        changePoint(point);
        // Value is zero for x and y
        System.out.println(point);
    }


    static void changePoint(Point point){
        point.x = 0;
        point.y = 0;
    }

    static void incrementValue(int value){
        value++;
    }
}
