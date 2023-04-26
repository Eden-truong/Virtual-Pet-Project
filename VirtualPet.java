public class VirtualPet {
    private String name;
    private int age;
    private PetNeeds petNeeds; //you will need a non-primitive type
    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
        this.petNeeds = new PetNeeds();
    }
    private int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public void feed() {
        petNeeds.decreaseHunger(getRandomNumber(10, 20));
    }
    public void drink() {
        petNeeds.decreaseThirst(getRandomNumber(10, 20));
    }
    public void play() {
        petNeeds.increaseHappiness(getRandomNumber(10,20));
    }
    public boolean isSick() {
        if (petNeeds.getHunger() > 100 || petNeeds.getThirst() > 100) {
            return true;
        }
        return false;
    }
    public boolean isSad() {
        if (petNeeds.getHappiness() < 0) {
            return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void printStatus() {
        System.out.println(name + "- Age: " + age);
        System.out.println("Hunger: " + petNeeds.getHunger() + "/100");
        System.out.println("Thirst: " + petNeeds.getThirst() + "/100");
        System.out.println("Happiness: " + petNeeds.getHappiness() + "/100");
        System.out.println();
    }
}
