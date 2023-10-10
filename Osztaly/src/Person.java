public class Person {
    private String _firstName;
    private String _lastName;
    private int _birthYear;
    private int _birthMonth;
    private int _birthDay;

    public Person(String _firstName, String _lastName, int _birthYear, int _birthMonth, int _birthDay) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._birthYear = _birthYear;
        this._birthMonth = _birthMonth;
        this._birthDay = _birthDay;
    }

    public void printPerson() {
        System.out.println("Vezetéknév: " + _lastName);
        System.out.println("Utónév: " + _firstName);
        System.out.println("Születési idő: " + _birthYear + "." + String.format("%02d", _birthMonth) + "." + String.format("%02d", _birthDay));
    }


    public String get_firstName() {
        return _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public int get_birthYear() {
        return _birthYear;
    }

    public int get_birthMonth() {
        return _birthMonth;
    }

    public int get_birthDay() {
        return _birthDay;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public void set_birthYear(int _birthYear) {
        this._birthYear = _birthYear;
    }

    public void set_birthMonth(int _birthMonth) {
        this._birthMonth = _birthMonth;
    }

    public void set_birthDay(int _birthDay) {
        this._birthDay = _birthDay;
    }

    public static void main(String[] args) {
        Person person = new Person("Frigyes", "Nagy", 1998, 1, 24);
        person.printPerson();
    }
}
