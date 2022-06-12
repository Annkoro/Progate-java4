class Main {
  public static void main(String[] args) {
    Person person1 = new Person("kate", "Jones", 27, 1.6, 50.0, "医者");
    person1.printData();
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    person2.printData();
    Person.printCount();
    System.out.println("----------------------");
    person1.setMiddleName("Claire");
    person1.setJob("獣医");
    System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
  }
}
