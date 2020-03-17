public class Adresse {
    //postnr,by,kortnavn,væsensnavn,adresse,latitude,bibliotekstype,id,longitude,navn
    // 1420,København K,Christianshavn,Københavns Biblioteker,
    // Dronningensgade 53,55.6723406,Folkebibliotek,710106,12.5921292,Christianshavns Bibliotek
    String postNr;
    String by;
    String vejNavn;
    int vejNr;

    public Adresse(String postNr, String by) {
        this.postNr = postNr;
        this.by = by;
    }

    public String getPostNr() {
        return postNr;
    }

    public String getBy() {
        return by;
    }

    public String getVejNavn() {
        return vejNavn;
    }

    public void setVejNavn(String vejNavn) {
        this.vejNavn = vejNavn;
    }

    public int getVejNr() {
        return vejNr;
    }

    public void setVejNr(int vejNr) {
        this.vejNr = vejNr;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "postNr='" + postNr + '\'' +
                ", by='" + by + '\'' +
                ", vejNavn='" + vejNavn + '\'' +
                ", vejNr=" + vejNr +
                '}';
    }
}
