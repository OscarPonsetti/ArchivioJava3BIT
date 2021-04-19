package archiviojava3bit;

import java.util.ArrayList;

/**
 * Contiene gli oggetti del programma.
 * Implementata tramite un ArrayList.
 * Ci permette di inserire gli oggetti,
 * effettuare ricerche e
 * aggiungere/rimuovere/modificare un oggetto.
 * @author Oscar Ponsetti
 */
public class Archivio 
{  
    
    //creo un arrayList che conterrà tutti i ricambi dell'archivio    
    private ArrayList <Ricambio>  magazzino;

    //Facciamo il costruttore

    public Archivio()
        {
        //Ho creato l'array list che è vuoto
        magazzino = new ArrayList(0);
        }





    
}
