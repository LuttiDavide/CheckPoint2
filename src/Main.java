/*Applicazione Java per la Gestione di una collezione di fumetti

Classe Comic:

Crea una classe Comic che rappresenti un fumetto. Definisci gli attributi:

    name (nome della collezione di fumetti)
    title (titolo del fumetto),
    releaseDate (data di uscita)
    releaseNumber (indica il numero di uscita). es: Topolino, Topolinia è in pericolo!, 02-mar-2022 - 103

Implementa un costruttore che accetti:

    il nome
    il titolo
    la data di uscita
    numero di uscita. Fornisci metodi pubblici (getter e setter) per tutti gli attributi definiti.

Classe ComicManager:

    Crea una classe ComicManager che gestisca una lista di fumetti.
    Implementa un'ArrayList per memorizzare i fumetti.

Fornisci metodi per:

    Aggiungere un nuovo fumetto alla lista.
    Rimuovere un fumetto dalla lista.
    Cercare un fumetto per numero di uscita e nome della collezione.
    Modificare gli attributi di un fumetto.

Uso:

    Utilizza il metodo main per usare tutte le funzionalità dell'applicazione.
    Assicurati che tutte le funzioni create lavorino correttamente.*/

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        ComicManager comicManager = new ComicManager();

        Comic comic1 = new Comic("fumetto1", "bello", OffsetDateTime.parse("2022-03-02T00:00:00Z"), 1);
        Comic comic2 = new Comic("fumetto2", "brutto", OffsetDateTime.parse("2023-06-01T00:00:00Z"), 2);
        Comic comic3 = new Comic("fumetto3", "meh", OffsetDateTime.parse("2023-09-15T00:00:00Z"), 3);
        comicManager.addComic(comic1);
        comicManager.addComic(comic2);
        comicManager.addComic(comic3);

        System.out.println("lista fumetti:");
        comicManager.printComics();

        System.out.println("ricerca fumetto con release number 1 e nome fumetto1:");
        Comic foundComic = comicManager.findComic(1, "fumetto1");
        if (foundComic != null) {
            System.out.println(foundComic);
        } else {
            System.out.println("fumetto non trovato");
        }

        System.out.println("modifica fumetto1");
        comicManager.modifyComic(comicManager.findComic(1, "fumetto1"), "fumettoMod", "bellissimo", OffsetDateTime.parse("2023-12-01T00:00:00Z"));

        System.out.println("lista aggiornata fumetti:");
        comicManager.printComics();

        System.out.println("rimozione comic3");
        comicManager.removeComic(comic3);

        System.out.println("lista aggiornata fumetti:");
        comicManager.printComics();
    }
}