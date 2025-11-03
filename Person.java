public class Person {
    protected String name;
    protected int age;  
    protected int number;

    public Person(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
    }
}
