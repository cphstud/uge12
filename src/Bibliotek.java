public class Bibliotek {
    //postnr,by,kortnavn,væsensnavn,adresse,latitude,bibliotekstype,id,longitude,navn
    // 1420,København K,Christianshavn,Københavns Biblioteker,
    // Dronningensgade 53,55.6723406,Folkebibliotek,710106,12.5921292,Christianshavns Bibliotek
    String kortNavn;
    String væsensNavn;
    String type;
    int id;
    Adresse adresse;
    double lat;
    double lng;

    public Bibliotek(String kortNavn, String væsensNavn, double lat, double lng, int id) {
        this.kortNavn = kortNavn;
        this.væsensNavn = væsensNavn;
        this.lat = lat;
        this.lng = lng;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public void setType(String  type) {
        this.type=type;
    }

    public String getKortNavn() {
        return kortNavn;
    }

    public String getVæsensNavn() {
        return væsensNavn;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "kortNavn='" + kortNavn + '\'' +
                ", væsensNavn='" + væsensNavn + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", adresse=" + adresse +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
