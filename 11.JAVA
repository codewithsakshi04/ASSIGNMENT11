public class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sakshi";
        s.age = 20;
        s.display();
    }
}
