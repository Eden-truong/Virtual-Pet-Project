public class PetNeeds {
    private int hunger;
    private int thirst;
    private int happiness;
    public PetNeeds() {
        hunger = 50;
        thirst = 50;
        happiness = 50;
    }
    public void decreaseHunger(int decrease) {
        hunger -= decrease;
        if (hunger < 0) {
            hunger = 0;
        }
    }
    public void decreaseThirst(int decrease) {
        thirst -= decrease;
        if (thirst < 0) {
            thirst = 0;
        }
    }
    public void increaseHappiness(int increase) {
        happiness += increase;
        if (happiness > 100) {
            happiness = 100;
        }
    }
    public int getHunger() {

        return hunger;
    }
    public void setHunger(int hunger) {

        this.hunger = hunger;
    }
    public int getThirst() {

        return thirst;
    }
    public void setThirst(int thirst) {

        this.thirst = thirst;
    }
    public int getHappiness() {

        return happiness;
    }

    public void setHappiness(int happiness) {

        this.happiness = happiness;
    }

}
