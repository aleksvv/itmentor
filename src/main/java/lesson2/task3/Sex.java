package task3;

public class Sex {
    final String MAN;
    final String WOMAN;
    public String gender;

    public Sex(char gen) {
        MAN = "MAN";
        WOMAN = "WOMAN";
        if (gen == 'f' || gen == 'F') {
            gender = WOMAN;
        } else if (gen == 'm' || gen == 'M') {
            gender = MAN;
        } else {
            gender = "nonidentical";
        }
    }
}