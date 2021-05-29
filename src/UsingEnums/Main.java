package UsingEnums;

public class Main {
    public static void main(String[] args) {
        // Here the problem is that anyone can come and change the model
        // to anything else
        Iphone iphone1 = new Iphone(12312,"IPHONE_7");
        Iphone iphone2 = new Iphone(12312,"IPHONE_8");

        // For example, this can be done !. Not a valid model
        Iphone iphone3 = new Iphone(12313,"lol");

        // For these kind of purposes we use enums
        // Enum is a class which allows us to represent
        // a group of constants

        // Another use case is if we have person class
        // and we have a gender field in it.

        // We can make the gender field as enum
        // public enum Gender{
        //   MALE,FEMALE
        // }
    }
}
