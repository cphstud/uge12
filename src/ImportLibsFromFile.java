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
        // lav bibliotek
        // put bibliotek i Liste
        File fh = new File(filename);
        String line = "";
        String vejFull = "";
        String[] vejFullArr = null;
        String vejNavn = "";
        int vejNr = 0;
        String[] lineArr = null;
        Adresse tmpAdresse = null;
        Bibliotek tmpBibliotek = null;

        if (fh.exists()) {
            Scanner ms = new Scanner(fh);
            while (ms.hasNextLine()) {
                try {
                    line = ms.nextLine();
                    lineArr = line.split(",");
                    tmpAdresse = new Adresse(lineArr[0],lineArr[1]);
                    vejFull = lineArr[4];
                    vejFullArr = vejFull.split(" ");
                    try {
                        vejNavn = vejFullArr[0];
                        vejNr = Integer.parseInt(vejFullArr[1]);
                        tmpAdresse.setVejNavn(vejNavn);
                        tmpAdresse.setVejNr(vejNr);
                    } catch (Exception e) {
                        System.out.println("Error:  "+ e.toString());
                        tmpAdresse.setVejNavn(vejFull);
                    }

                    tmpBibliotek = new Bibliotek(lineArr[2],lineArr[3],Double.parseDouble(lineArr[5]), Double.parseDouble(lineArr[8]),Integer.parseInt(lineArr[7]));
                    tmpBibliotek.setType(lineArr[6]);
                    tmpBibliotek.setAdresse(tmpAdresse);
                    returBib.add(tmpBibliotek);
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
