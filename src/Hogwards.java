public abstract class Hogwards {


    private String student;
    private int thePowerOfMagic;
    private int theDistanceOfTheTransgression;


    public Hogwards(String student, int thePowerOfMagic, int theDistanceOfTheTransgression) {
        this.student = student;
        this.thePowerOfMagic = thePowerOfMagic;
        this.theDistanceOfTheTransgression = theDistanceOfTheTransgression;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }


    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTheDistanceOfTheTransgression() {
        return theDistanceOfTheTransgression;
    }

    public void setTheDistanceOfTheTransgression(int theDistanceOfTheTransgression) {
        this.theDistanceOfTheTransgression = theDistanceOfTheTransgression;
    }

    private int ability() {
        return thePowerOfMagic + theDistanceOfTheTransgression;
    }

    public void print() {
        System.out.println(this);
    }

    public void сompareHogwards(Hogwards studentHogwards) {
        int ability1 = ability();
        int ability2 = studentHogwards.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s; %d VS %d%n",
                    getStudent(), studentHogwards.getStudent(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s; %d VS %d%n",
                    studentHogwards.getStudent(), getStudent(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s; %d VS %d%n",
                    getStudent(), studentHogwards.getStudent(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент: %s; сила магии: %d; расстояния трансгрессии: %d;",
                student, thePowerOfMagic, theDistanceOfTheTransgression);
    }
}
