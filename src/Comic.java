//Crea una classe Comic che rappresenti un fumetto. Definisci gli attributi:
//
//name (nome della collezione di fumetti)
//title (titolo del fumetto),
//releaseDate (data di uscita)
//releaseNumber (indica il numero di uscita). es: Topolino, Topolinia è in pericolo!, 02-mar-2022 - 103


import java.time.OffsetDateTime;
import java.util.Date;

public class Comic {

    private String name;
    private String title;
    private OffsetDateTime releaseDate;
    private int releaseNumber;

    public Comic(String name, String title, OffsetDateTime releaseDate, int releaseNumber) {
        this.name = name;
        this.title = title;
        this.releaseDate = releaseDate;
        this.releaseNumber = releaseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OffsetDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(OffsetDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Fumetto{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
