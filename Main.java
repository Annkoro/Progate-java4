class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.hello();
    person1.name = "kate Jones";
    System.out.println(person1.name);
    Person person2 = new Person();
    person2.hello();
    person2.name = "John Christopher Smith";
    System.out.println(person2.name);
  }
}
