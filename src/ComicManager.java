//Classe ComicManager:
//
//Crea una classe ComicManager che gestisca una lista di fumetti.
//Implementa un'ArrayList per memorizzare i fumetti.
//
//Fornisci metodi per:
//
//Aggiungere un nuovo fumetto alla lista.
//Rimuovere un fumetto dalla lista.
//Cercare un fumetto per numero di uscita e nome della collezione.
//Modificare gli attributi di un fumetto.
//

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ComicManager {

    private ArrayList<Comic> comics = new ArrayList<>();

    public void addComic(Comic comic) {
        comics.add(comic);
    }

    public void removeComic(Comic comic) {
        comics.remove(comic);
    }

    public Comic findComic(int releaseNumber, String name) {
        for (Comic c : comics) {
            if (c.getReleaseNumber() == releaseNumber && c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public void modifyComic(Comic comic, String name, String title, OffsetDateTime releaseDate) {
        comic.setName(name);
        comic.setTitle(title);
        comic.setReleaseDate(releaseDate);
    }

    public void printComics() {
        for (Comic c : comics) {
            System.out.println(c);
        }
    }
}
