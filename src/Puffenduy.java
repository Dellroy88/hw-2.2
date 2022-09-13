public class Puffenduy extends Hogwards {


    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String student, int thePowerOfMagic, int theDistanceOfTheTransgression,
                     int hardworking, int loyal, int honest) {
        super(student, thePowerOfMagic, theDistanceOfTheTransgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    private int ability() {
        return hardworking + loyal + honest;
    }

    public void сomparePuffenduy(Puffenduy studentPuffenduy) {
        int ability1 = ability();
        int ability2 = studentPuffenduy.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s; %d VS %d%n",
                    getStudent(), studentPuffenduy.getStudent(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s; %d VS %d%n",
                    studentPuffenduy.getStudent(), getStudent(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, как Пуффендуец %s; %d VS %d%n",
                    getStudent(), studentPuffenduy.getStudent(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; лояльность: %d; честность: %d", super.toString(),
                hardworking, loyal, honest);
    }

}
