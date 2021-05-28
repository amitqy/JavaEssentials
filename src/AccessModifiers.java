public class AccessModifiers {
    public static void main(String[] args) {

    }

    // This class is package protected
    // Only accessible from within this package
    static class Lens{

    }

    // not package protected
    // can be accessible by every thing

    public class Specs{

    }

    // accessible with a class only
    private static class Color{

    }
}
