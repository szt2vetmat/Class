public class Date {
    private int _year;
    private int _month;
    private int _day;

    public Date(int _year, int _month, int _day) {
        this._year = _year;
        this._month = _month;
        this._day = _day;
    }

    public boolean isCorrectDate() {
        if (1 <= _month && _month <= 12) {
            if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
                return (1 <= _day && _day <= 31);
            } else if (_month == 4 || _month == 6 || _month == 9 || _month == 11) {
                return (1 <= _day && _day <= 30);
            } else {
                // Február esetén szökőév ellenőrzése
                if ((_year % 4 == 0 && _year % 100 != 0) || (_year % 400 == 0)) {
                    return (1 <= _day && _day <= 29);
                } else {
                    return (1 <= _day && _day <= 28);
                }
            }
        }
        return false;
    }

    public void printDate() {
        System.out.println("Dátum: " + _year + "." + String.format("%02d", _month) + "." + String.format("%02d", _day));
    }


    public int get_year() {
        return _year;
    }

    public int get_month() {
        return _month;
    }

    public int get_day() {
        return _day;
    }

    public void set_year(int _year) {
        this._year = _year;
    }

    public void set_month(int _month) {
        this._month = _month;
    }

    public void set_day(int _day) {
        this._day = _day;
    }

    public static void main(String[] args) {
        Date date = new Date(2023, 5, 30);
        date.printDate();
    }
}
