public class Telephone {

  private String model;
  private String serialNumber;
  private String color;
  private boolean isMobile;

  public Telephone(String model, String serialNumber, String color, boolean isMobile) {
    this.model = model;
    this.serialNumber = serialNumber;
    this.color = color;
    this.isMobile = isMobile;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isMobile() {
    return isMobile;
  }

  public void setMobile(boolean mobile) {
    isMobile = mobile;
  }

  @Override
  public String toString() {
    return "Telephone{" +
        "model='" + model + '\'' +
        ", serialNumber='" + serialNumber + '\'' +
        ", color='" + color + '\'' +
        ", isMobile=" + isMobile +
        '}';
  }
}
