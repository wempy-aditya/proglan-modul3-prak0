//tugas 1 langkah 2
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void displayAge() {
        System.out.println("I am " + age + " years old");
    }


    public static void main(String[] args) {
        // Autocomplete for main method: psvm
        Person person = new Person("John", 30);

        // Autocomplete for println: sout
        person.sayHello();
        person.displayAge();

        // Autocomplete for loop: fori
        for (int i = 0; i < 5; i++) {
            System.out.println("Index: " + i);
        }

        // Autocomplete for enhanced for loop: iter
        String[] fruits = {"Apple", "Orange", "Banana"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Autocomplete for null check: ifn
        String exampleString = null;
        if (exampleString == null) {
            System.out.println("Example string is null");
        }

        // Autocomplete for constant: psf
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
    }
}
