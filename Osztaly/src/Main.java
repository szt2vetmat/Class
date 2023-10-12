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


        //Date
        Date date1 = new Date(2023, 5, 30);
        date1.printDate();
        Date date2 = new Date(2022, 2, 30);
        if (date2.isCorrectDate()) {
            date2.printDate();
        } else {
            System.out.println("Helytelen dátum.");
        }
        Date date3 = new Date(2021, 6, 1);
        date3.printDate();





    }
}
