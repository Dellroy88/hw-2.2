public class Griffindor extends Hogwards {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String student, int thePowerOfMagic, int theDistanceOfTheTransgression,
                      int nobility, int honor, int bravery) {
        super(student, thePowerOfMagic, theDistanceOfTheTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int ability() {
        return nobility + honor + bravery;
    }

    public void сompareGriffendor(Griffindor studentGriffendor) {
        int ability1 = ability();
        int ability2 = studentGriffendor.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффендорец %s лучше, чем Гриффендорец %s; %d VS %d%n",
                    getStudent(), studentGriffendor.getStudent(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффендорец %s лучше, чем Гриффендорец %s; %d VS %d%n",
                    studentGriffendor.getStudent(), getStudent(), ability2, ability1);
        } else {
            System.out.printf("Гриффендорец %s такой же, как Гриффендорец %s; %d VS %d%n",
                    getStudent(), studentGriffendor.getStudent(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), nobility, honor, bravery);
    }
}
