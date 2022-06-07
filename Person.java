class Person {
  public String name;
  
  //　コンストラクタの定義、String型の引数を受け取る
  Person(String name) {
    System.out.println("インスタンスが生成されました");
    //インスタンスフィールドnameに値をセットする
      this.name = name;
  }
  
  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
