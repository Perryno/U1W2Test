import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


public class Catalogo {
    private List<Elemento> elementi;

    public Catalogo() {
        elementi = new ArrayList<>();
    }

    public void aggiungiElemento(Elemento elemento) {
        elementi.add(elemento);
    }

    public void rimuoviElemento(String codiceISBN) {
        elementi.removeIf(e -> e.getCodiceISBN().equals(codiceISBN));
    }

    public String ricercaPerISBN(String codiceISBN) {
        return elementi.stream()
                .filter(e -> e.getCodiceISBN().equals(codiceISBN))
                .map(Elemento::getTitolo)
                .findFirst()
                .orElse("Elemento non trovato");
    }


    public String ricercaPerAnnoPubblicazione(int annoPubblicazione) {
        return elementi.stream()
                
                .filter(e -> e.getAnnoPubblicazione() == annoPubblicazione)
                .map(Elemento::getTitolo)
                .collect(Collectors.joining(", "));
    }

    

    public String ricercaPerAutore(String autore) {
        return elementi.stream()
                .filter(e -> e instanceof Libro)
                .filter(e -> ((Libro) e).getAutore().equals(autore))
                .map(Elemento::getTitolo)
                .collect(Collectors.joining(", "));
    }

}

