package UsingEnums;

public class IphoneClassUsingEnum {
  private int price;
  private IphoneModel model;

  IphoneClassUsingEnum(int price, IphoneModel model){
    this.price = price;
    this.model = model;

  }

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
