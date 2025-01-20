public class Person {
    private String name;
    private int age;
    private String address;

    // Regular constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
        this.address = otherPerson.address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "123 Main St");
        Person person2 = new Person(person1); // Cloning person1

        // Modifying person2 to show they're independent objects
        person2.setName("Bob");
        person2.setAge(25);

        System.out.println(person1); // Output: Person{name='Alice', age=30, address='123 Main St'}
        System.out.println(person2); // Output: Person{name='Bob', age=25, address='123 Main St'}
    }
}
