import java.awt.*;
import java.time.LocalDate;

public class VarKeyword {
    public static void main(String[] args) {
        // We need to tell data type
         String name = "Jamil";
         Point point = new Point(10,10);
         double PI = Math.PI;
        LocalDate now = LocalDate.now();

        // Type is inferred automatically by compiler
        var name2 = "HSHSH";
        var point2 = new Point(10,10);
        var PI2 = Math.PI;
        var now2  = LocalDate.now();
    }
}
