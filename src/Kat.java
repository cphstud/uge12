public class Kat extends Animal{
    private int catId;
    public Kat(String name, String sBreed, String pBreed, String colour, boolean deSexed, String gender, int age, String location) {
        super(name, sBreed, pBreed, colour, deSexed, gender, age, location);
        this.catId=123;
    }

    @Override
    public void makeSound() {
        System.out.println("Miav Miav");
    }

}
