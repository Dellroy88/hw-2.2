public class Slizerin extends Hogwards {


    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slizerin(String student, int thePowerOfMagic, int theDistanceOfTheTransgression,
                    int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(student, thePowerOfMagic, theDistanceOfTheTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    private int ability() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public void сompareSlizerin(Slizerin studentSlizerin) {
        int ability1 = ability();
        int ability2 = studentSlizerin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизернец %s лучше, чем Слизернец %s; %d VS %d%n",
                    getStudent(), studentSlizerin.getStudent(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизернец %s лучше, чем Слизернец %s; %d VS %d%n",
                    studentSlizerin.getStudent(), getStudent(), ability2, ability1);
        } else {
            System.out.printf("Слизернец %s такой же, как Слизернец %s; %d VS %d%n",
                    getStudent(), studentSlizerin.getStudent(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; честолюбие: %d; находчивость: %d; жажда власти", super.toString(),
                cunning, determination, ambition, resourcefulness, thirstForPower);
    }
}
