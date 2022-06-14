class Bicycle {
  private String name;
  Bicycle(String name, String color) {
    this.name = name;
  }
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
  }
}
