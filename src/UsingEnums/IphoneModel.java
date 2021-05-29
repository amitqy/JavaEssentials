package UsingEnums;

public enum IphoneModel {
    IPHONE_7, IPHONE_8, IPHONE_X;

}


/*   We can also use enums as String representation of enum
           constants.

         public enum IphoneModel{
           IPHONE_7_PLUS( "iphone 7 plus"),
           IPHONE_8("iphone 8"),
           IPHONE_X("iphone X");

           // This model string is mapped to each of the constants
           private String model;

           IphoneModel(String model){
             this.model = model;
           }
           public String getModel(){
             return model;
           }
          }

      -----Usage-----

           IphoneClassUsingEnum iphone1 = new IphoneClassUsingEnum(900000,IphoneModel.IPHONE_7_PLUS);
           System.out.println(iphone1.getModel());
           // IPHONE_7_PLUS, the enum constant
           System.out.println(iphone1.getModel().getModel());
           // "iphone 7 plus", the string corresponding to enum constant

  */





