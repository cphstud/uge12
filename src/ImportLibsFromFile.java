import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportLibsFromFile {

    //postnr,by,kortnavn,væsensnavn,adresse,latitude,bibliotekstype,id,longitude,navn
    // 1420,København K,Christianshavn,Københavns Biblioteker,
    // Dronningensgade 53,55.6723406,Folkebibliotek,710106,12.5921292,Christianshavns Bibliotek
    public ArrayList<Bibliotek> importFromFile(String filename) throws FileNotFoundException{
        ArrayList<Bibliotek> returBib = new ArrayList<>();
        // TODO
        // loop igennem filen linje for linje
        // lav addresse
        // lav bibliotek
        // tilføj addresse til bibliotek
        // put bibliotek i liste

        if (fh.exists()) {
            Scanner ms = new Scanner(fh);
            while (ms.hasNextLine()) {
                try {
                tmpAdresse = new Adresse();
                    tmpBibliotek = new Bibliotek(//TODO: konstruktør);
                } catch (Exception e) {
                    System.out.println("Line not ok: " + line);
                }
            }
        } else {
            throw new FileNotFoundException();
        }
        return returBib;
    }
}
