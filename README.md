# Uge12: Filer I/O 
### onsdag d 17/3 kl 8.30
Jeg regner med at være online fra ca kl 8.30 så I kan spørge.
Dagens opgaver bygger videre på tirsdagens lektion.

#### Animals
Tjek filen Animals.csv
Her forekommer der to slags dyr - Hunde og Katte. Lav en abstrakt klasse Dyr og et Bur.
Hund og Kat skal extende Dyr. Dyr-konstruktøren laves ud fra filen.
Klassen Dyr skal have en abstrakt metode - makeSound() - som de to klasser Kat og Hund skal implementere.
Buret skal ha' et navn, et nummer og en liste af dyr samt en metode Larm() hvor dyrene laver deres larm (polymorfi)
Lav til sidst en klasse der har en metode som kan fylde buret med dyr ud fra filen.


#### Biblioteker
Der ligger noget kode i en branch her på siden - task. Koden mangler noget funktionalitet.
Så ImportLibsFromFile skal fixes så den returnerer en liste med biblioteker.
Brug try-catch til at "springe over" de rækker som fejler.
Læg mærke til at et biblioteks egenskaber er en kombi af almindelige datatyper og så reference-type: Adresse
Der ligger flere filer - bla. bibliotek-new-delimiter.csv (tak til Emil E). Der var nemlig flere adresser som havde et komma i sig
("Holte Midtpunkt 23, 2. sal"). Men Emil har skiftet delimiteren ud til et semi-kolon.
Der er også en klasse - ExportBibliotekerToFile. Lav det sådan at en bruger kan indtaste et postnummer og derpå få en liste af biblioteker tilbage som ligger i en given afstand fra det indtastede postnr. Brugeren bestemmer også denne afstand.

