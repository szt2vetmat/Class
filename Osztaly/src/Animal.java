public class Animal {
    private int _numberOfLegs;
    private int _numberOfEyes;
    private String _name;

    public Animal(int _numberOfLegs, int _numberOfEyes, String _name) {
        this._numberOfLegs = _numberOfLegs;
        this._numberOfEyes = _numberOfEyes;
        this._name = _name;
    }

    public void printAnimal() {
        System.out.println("Név: " + _name);
        System.out.println("Lábak száma: " + _numberOfLegs);
        System.out.println("Szemek száma: " + _numberOfEyes);
    }

    public int get_numberOfLegs() {
        return _numberOfLegs;
    }

    public int get_numberOfEyes() {
        return _numberOfEyes;
    }

    public String get_name() {
        return _name;
    }

    public void set_numberOfLegs(int _numberOfLegs) {
        this._numberOfLegs = _numberOfLegs;
    }

    public void set_numberOfEyes(int _numberOfEyes) {
        this._numberOfEyes = _numberOfEyes;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal(4, 2, "Kutya");
        animal.printAnimal();
    }
}
