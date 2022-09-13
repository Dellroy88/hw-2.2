public class Kogtevran extends Hogwards {

    private int wise;
    private int witty;
    private int creative;
    private int smart;

    public Kogtevran(String student, int thePowerOfMagic, int theDistanceOfTheTransgression,
                     int wise, int witty, int creative, int smart) {
        super(student, thePowerOfMagic, theDistanceOfTheTransgression);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    private int ability() {
        return wise + witty + creative + smart;
    }

    public void сompareKogtevran(Kogtevran studentKogtevran) {
        int ability1 = ability();
        int ability2 = studentKogtevran.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s; %d VS %d%n",
                    getStudent(), studentKogtevran.getStudent(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s; %d VS %d%n",
                    studentKogtevran.getStudent(), getStudent(), ability2, ability1);
        } else {
            System.out.printf("Когтевранец %s такой же, как Когтевранец %s; %d VS %d%n",
                    getStudent(), studentKogtevran.getStudent(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; мудрость: %d; остроумность: %d; творчество: %d; ум: %d;", super.toString(),
                wise, witty, creative,smart);
    }
}
