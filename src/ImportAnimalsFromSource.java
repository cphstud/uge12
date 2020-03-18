import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportAnimalsFromSource {

    public ArrayList<Animal> getList(String filename) throws FileNotFoundException {
        ArrayList<Animal> returList = new ArrayList<>();
        // TODO:
        File fh = new File(filename);
        if (fh.exists()) {
            Scanner fs = new Scanner(fh);
            String line = "";
            String[] lineArr = null;
            while(fs.hasNextLine()) {
                line = fs.nextLine();
                System.out.println("Line: " + line);
            }
        } else {
            throw new FileNotFoundException();
        }

        return returList;
    }
}
