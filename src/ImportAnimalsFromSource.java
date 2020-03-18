import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportAnimalsFromSource {

    /*
    AnimalType,Name,SpecificBreed,PrimaryBreed,PrimaryColour,De-sexed,Gender,Age,Locality
    D         ,Emie,FOXTERRMN ,FOXTER,BlackWhite,Y,F,21,BURNSIDE
    D         ,Tia,LABRADORX ,LABRAD,Black     ,Y,F,14,COOLUM BEACH

    Cat       ,Tiger,TABBY     ,TABBY ,Unknown   ,Y,F,14,DOONAN
    String name, String sBreed, String pBreed, String colour, boolean deSexed, String gender,int age
     */
    public ArrayList<Animal> getList(String filename) throws FileNotFoundException {
        ArrayList<Animal> returList = new ArrayList<>();
        // TODO:
        File fh = new File(filename);
        Animal animal = null;
        if (fh.exists()) {
            Scanner fs = new Scanner(fh);
            String line = "";
            boolean deSexed = false;
            String[] lineArr = null;
            while(fs.hasNextLine()) {
                line = fs.nextLine();
                System.out.println("Line: " + line);
                lineArr = line.split(",");
                String startChar = lineArr[0];
                if(lineArr[5].equals("Y")) {
                    deSexed=true;
                }
                if (startChar.contains("D")) {
                    // TODO:lav en hund
                    animal = new Hund(lineArr[1],lineArr[2],lineArr[3],lineArr[4],deSexed,lineArr[6],Integer.parseInt(lineArr[7]),lineArr[8]);
                    returList.add(animal);
                } else if (startChar.contains("at")) {
                    // TODO:lav en kat
                    animal = new Kat(lineArr[1],lineArr[2],lineArr[3],lineArr[4],deSexed,lineArr[6],Integer.parseInt(lineArr[7]),lineArr[8]);
                    returList.add(animal);
                } else {
                    System.out.println("no animal");
                }
            }
        } else {
            throw new FileNotFoundException();
        }

        return returList;
    }
}
