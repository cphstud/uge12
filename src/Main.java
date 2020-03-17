import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {


        String filename = "Data/bibtest.csv";
        filename = "Data/biblioteker.csv";
        ImportLibsFromFile importLibsFromFile = new ImportLibsFromFile();
        ArrayList<Bibliotek> biblioteker = new ArrayList<>();
        try {
            biblioteker = importLibsFromFile.importFromFile(filename);
            for(Bibliotek bibliotek: biblioteker) {
                System.out.println(bibliotek);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        ExportBibliotekerToFile exportBibliotekerToFile = new ExportBibliotekerToFile();
        exportBibliotekerToFile.exportToFile("Data/export.txt", 2500, biblioteker);

	// write your code here
    }
}
