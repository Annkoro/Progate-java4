class Person {
  public String name;
  
  //　コンストラクタの定義
  Person() {
    System.out.println("インスタンスが生成されました");
  }
  
  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
