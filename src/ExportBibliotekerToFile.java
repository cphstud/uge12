import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportBibliotekerToFile {

    public void exportToFile(String filename, int filter, ArrayList<Bibliotek> biblioteker) throws IOException {
        File fh = new File(filename);
        if (!fh.exists()) {
            fh.createNewFile();
        }
            FileWriter fw = new FileWriter(fh);

        for(Bibliotek bibliotek: biblioteker) {
            try {
                int tmpPostNr =Integer.parseInt(bibliotek.getAdresse().getPostNr()) ;
                if (tmpPostNr < filter) {
                    System.out.println("Hovedstaden");
                    fw.write(bibliotek.toString()+ "\n");
                }
            } catch (Exception e) {
                System.out.println("Error on " +bibliotek.getAdresse());
            }
        }
        fw.close();
    }
}
