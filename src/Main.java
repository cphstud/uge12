import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    /*

    Tjek filen Animals.csv Her forekommer der to slags dyr - Hunde og Katte. Lav en abstrakt klasse Dyr og et Bur.
    Hund og Kat skal extende Dyr. Dyr-konstruktøren laves ud fra filen. Klassen Dyr skal have en abstrakt metode - makeSound() -
    som de to klasser Kat og Hund skal implementere. Buret skal ha' et navn, et nummer og en liste af dyr samt en metode Larm()
    hvor dyrene laver deres larm (polymorfi) Lav til sidst en klasse der har en metode som kan fylde buret med dyr ud fra filen.

AnimalType,Name,SpecificBreed,PrimaryBreed,PrimaryColour,De-sexed,Gender,Age,Locality
D         ,Emie,FOXTERRMN ,FOXTER,BlackWhite,Y,F,21,BURNSIDE
D         ,Tia,LABRADORX ,LABRAD,Black     ,Y,F,14,COOLUM BEACH
Cat       ,Tiger,TABBY     ,TABBY ,Unknown   ,Y,F,14,DOONAN
Cat       ,Isobel,PERSIAN X ,PERSIA,Blue      ,Y,M,14,DOONAN
Cat       ,Twinky,TABBY     ,TABBY ,Unknown   ,Y,F,14,DOONAN
D         ,Duke,COLLBORDRX,COLLBO,BlackTanWh,N,M,13,WEYBA DOWNS
D         ,Kirby,KELPIEAUSX,KELPIE,Brindle   ,Y,F,11,MUDJIMBA
Cat       ,Alfie,DOMSH     ,DOMSH ,Ginger    ,Y,M,10,MOUNTAIN CREEK
D         ,Toby,COLLBORDR ,COLLBO,Chocolate ,Y,M,11,NINDERRY
D         ,Louis,FOXTERRMN ,FOXTER,BlackTanWh,Y,M,11,BUDERIM
Cat       ,Bear,TABBY     ,TABBY ,Grey      ,Y,F,13,EUMUNDI
D         ,Joe,MALTESEX  ,MALTES,White     ,Y,M,11,PALMWOODS
Cat       ,Sari,BIRMAN    ,BIRMAN,WhiteGrey ,Y,F,11,BIRTINYA

     */

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Animal> listOfAnimals = new ArrayList<>();

        String filename = "Data/Animals.csv";
        ImportAnimalsFromSource importAnimalsFromSource = new ImportAnimalsFromSource();
        listOfAnimals = importAnimalsFromSource.getList(filename);
        System.out.println(listOfAnimals.size());
	// write your code here
    }
}
