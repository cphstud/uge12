public class Hund extends Animal{
    private int dogId;

    public Hund(String name, String sBreed, String pBreed, String colour, boolean deSexed, String gender, int age, String location) {
        super(name, sBreed, pBreed, colour, deSexed, gender, age,location);
        this.dogId = 10;
    }

    @Override
    public void makeSound() {
        System.out.println("Vov Vov");
    }
}
