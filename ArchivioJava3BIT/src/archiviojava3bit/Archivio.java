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

 //Mi permette di inserire un articolo nel magazzino (gli passiamo un oggetto di tipo ricambio)
    
    public void inserimento(Ricambio ricambio)
        {
        //Questo metodo deve aggiungere l'oggetto ricevuto nell'ArrayList
        magazzino.add(ricambio);
        //Il metodo add aggiunge un oggetto alla fine dell'ArrayList
        }

//Faccio un metodo che cerchi nell'archivio (trova il codice), viene passato il codice

    public Ricambio ricerca(String codice)
    {
    int i;
    for(i=0;i<magazzino.size();i++)
        {
        //Prima ci facciamo restituire l'oggetto (il codice è dentro la classe)
        Ricambio ricambio = magazzino.get(i);
        if(ricambio.getCodice()==codice)
            {
            return ricambio;
            }
        
        }
    //Se si arriva qua significa che il ricambio non c'è in magazzino
    return null;
    }






}
