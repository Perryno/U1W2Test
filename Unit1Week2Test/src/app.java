
public class app {

	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		
		Libro HarryPotto = new Libro("22784123", "Harry Potto", 1982, 568, "Andrea Caforio", "fantasy");
		
		catalogo.aggiungiElemento(HarryPotto);
		
		Rivista TopGear = new Rivista("43124312","Top Gear", 2002, 55,Periodicita.MENSILE );
		Rivista TopGear2 = new Rivista("43125312","Top Gear2", 2002, 55,Periodicita.MENSILE );
		catalogo.aggiungiElemento(TopGear);
		catalogo.aggiungiElemento(TopGear2);
		catalogo.ricercaPerAnnoPubblicazione(2002);
		catalogo.ricercaPerAutore("Andrea Caforio");
		
		 System.out.println(catalogo.ricercaPerISBN("22784123")); 
		 System.out.println(catalogo.ricercaPerAnnoPubblicazione(2002));
		 System.out.println(catalogo.ricercaPerAutore("Andrea Caforio"));
	}

}
