public class Main {
    public static void main(String[] args) {

        //Person
        Person person1 = new Person("John", "Doe", 1990, 5, 15);
        person1.printPerson();
        person1.setBirthYear(1985);
        person1.setBirthMonth(9);
        person1.setBirthDay(25);
        person1.printPerson();
        Person person2 = new Person("Alice", "Smith", 1988, 3, 10);
        person2.printPerson();



    }
}
