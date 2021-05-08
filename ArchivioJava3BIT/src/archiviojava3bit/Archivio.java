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

//Eliminare l'articolo nell'archivio

public boolean elimina(String codice)
    {
    Ricambio ricambio;
    
    //Cerco il ricambio
    ricambio =ricerca(codice);
    
    //Se  l'articolo c'è lo cancello dall?ArrayList
    if(ricambio!=null)
        {
        magazzino.remove(ricambio);
   
        //Salvo tutto nel file ( da vedere)
    
        return true;
        }
    
    return false;
    }

//Facciamo anche qua il metodo toString (per trasformare tutto il nostro archivio in stringa)

    @Override
    public String toString ()
    {
    String s="";
    for(int i=0;i<magazzino.size();i++)
        {
        //Prendo l'articolo in posizione i
        Ricambio articolo = magazzino.get(i);
        s = s + articolo.toString();
        
        if(i<magazzino.size()-1)
            {
            //Se non sono sull'ultimo prodotto metto il ritorno a capo.                
            s = s + "\r\n";
            }
        }    
    return s;    
    }

//Metodo che visualizza l'elenco degli articoli

public ArrayList <Ricambio> elencoRicambi()
    {
    return magazzino;
    }

//Metodo che cerca il ricambio in base al prezzo

public ArrayList<Ricambio>  cercaRicambi(float prezzoMinimo, float prezzoMassimo)
    {
    //Creiamo un ArrayList locale che verrà rimepito con i ricambi con quel prezzo
    ArrayList<Ricambio> articoliTrovati = new ArrayList(0);
    int i;
    for(i=0;i<magazzino.size();i++)
            {
            //Scorro l'ArrayList
            Ricambio ricambio = magazzino.get(i);
            
            if(ricambio.getPrezzo()>=prezzoMinimo && ricambio.getPrezzo()<=prezzoMassimo)
                {
                //Ora aggiungo l'articolo all'ArrayList degli articoli trovati con quel prezzo
                articoliTrovati.add(ricambio);                    
                }
            }        
    //Adesso restituisco l'ArrayList (parametro del metodo)
    return articoliTrovati;
    }



//Metodo che restituisce tutti gli articoli con uno specifico uso

public ArrayList<Ricambio> cercaRicambioUso(String uso)
    {
    //Facciamo un ArrayList vuoto
    ArrayList<Ricambio> articoloUso = new ArrayList (0);
    
    //Facciamo diventare la string passata tutta minuscola
    String usoCercareMin = uso.toLowerCase();
    
    int i;
    for(i=0;i<magazzino.size();i++)
        {
        //Prendiamo il ricambio in posizione i
        Ricambio ricambio = magazzino.get(i);
        String usoMin = ricambio.getUso();
        
        //usiamo il metodo contain
        if(usoMin.contains(usoCercareMin));
            {
            //Lo aggiungo all'ArrayList articoloUso
            articoloUso.add(ricambio);
            
            }
        }
    
    //Restituisco l'ArrayList  
    
    return articoloUso;
    }

//Metodo che restituisce tutti gli atricoli con un determinato nome
public ArrayList<Ricambio> cercaRicambioNome(String nome)
    {
    //Facciamo un ArrayList vuoto
    ArrayList<Ricambio> articoloNome = new ArrayList (0);
    
    //Facciamo diventare la string passata tutta minuscola
    String nomeCercareMin = nome.toLowerCase();
    
    int i;
    for(i=0;i<magazzino.size();i++)
        {
        //Prendiamo il ricambio in posizione i
        Ricambio ricambio = magazzino.get(i);
        String nomeMin = ricambio.getUso();
        
        //usiamo il metodo contain
        if(nomeMin.contains(nomeCercareMin));
            {
            //Lo aggiungo all'ArrayList articoloUso
            articoloNome.add(ricambio);
            }
        }
    
    //Restituisco l'ArrayList  
    return articoloNome;
    }





}
