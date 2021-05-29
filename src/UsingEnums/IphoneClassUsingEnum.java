package UsingEnums;

public class IphoneClassUsingEnum {
  private int price;
  private IphoneModel model;

  IphoneClassUsingEnum(int price, IphoneModel model){
    this.price = price;
    this.model = model;

  }

  // returns the enum constant
  // corresponding to an this class instance
  public IphoneModel getModel(){
    return model;
  }

  @Override
  public String toString() {
    return "IphoneClassUsingEnum{" +
            "price=" + price +
            ", model=" + model +
            '}';
  }
}
