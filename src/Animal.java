public abstract class Animal {
    /*
    AnimalType,Name,SpecificBreed,PrimaryBreed,PrimaryColour,De-sexed,Gender,Age,Locality
    D         ,Emie,FOXTERRMN ,FOXTER,BlackWhite,Y,F,21,BURNSIDE
    D         ,Tia,LABRADORX ,LABRAD,Black     ,Y,F,14,COOLUM BEACH
    Cat       ,Tiger,TABBY     ,TABBY ,Unknown   ,Y,F,14,DOONAN
    gender: M,F,U

     */
    private static int counter=100;
    String name;
    String sBreed;
    String pBreed;
    String color;
    boolean deSexed;
    String gender;
    int age;
    int animalId;
    String location;

   public Animal(String name, String sBreed, String pBreed, String colour, boolean deSexed, String gender,int age, String location) {
       this.name=name;
       this.location=location;
       this.sBreed=sBreed;
       this.pBreed=pBreed;
       this.color=colour;
       this.deSexed=deSexed;
       this.age=age;
   }


    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public String getsBreed() {
        return sBreed;
    }

    public String getpBreed() {
        return pBreed;
    }

    public String getColor() {
        return color;
    }

    public boolean isDeSexed() {
        return deSexed;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getLocation() {
        return location;
    }
    public abstract void makeSound();
}
