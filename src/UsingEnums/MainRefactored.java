package UsingEnums;

public class MainRefactored {
    public static void main(String[] args) {

        // Utilizing enum

        IphoneClassUsingEnum iphone1 = new IphoneClassUsingEnum(900000,IphoneModel.IPHONE_7);
        IphoneClassUsingEnum iphone2 = new IphoneClassUsingEnum(1000000,IphoneModel.IPHONE_8);
        IphoneClassUsingEnum iphone3 = new IphoneClassUsingEnum(1000000,IphoneModel.IPHONE_X);

        // Can't do this now
        // IphoneClassUsingEnum iphone4 = new IphoneClassUsingEnum(123133,"lol");

    }
}
