import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args) {

        /**
         * In variables final keyword stops it changing value once
         * it is assigned.
         * Use it when we know that a number will never change
         * example PI
         *
         * In objects making stop them from being reassigned
         * to a new reference. However we can change object's value
         */
       final var name = "Anna";
        // Gives compiler error
        // name = "Alex";

        final var PIVal = Math.PI;
        final Point point = new Point(0,0);
        // Gives compiler error, can't change
        // the reference of object once it is previously given
        // point = new Point(100,100);

        // No compiler error, I can change value store
        //  at reference location
        point.x = 10;
        point.y = 133;
    }
}
