package archiviojava3bit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        
        //Lo riempiamo
        magazzino = leggiDaFile();
        
        
        }

 //Mi permette di inserire un articolo nel magazzino (gli passiamo un oggetto di tipo ricambio)
    
    public boolean inserimento(Ricambio ricambio)
        {
        // controllo che non ci sia già un ricambio con lo stesso codice
        if (Archivio.this.ricerca(ricambio.getCodice()) != null)
            {
            return false;
            }    
         magazzino.add(ricambio);
         SalvaSuFile();
         return true;                
        }

//Faccio un metodo che cerchi nell'archivio (trova il codice), viene passato il codice

    public Ricambio ricerca(String codice)
    {
    int i;
    for(i=0;i<magazzino.size();i++)
        {
        //Prima ci facciamo restituire l'oggetto (il codice è dentro la classe)
        Ricambio ricambio = magazzino.get(i);
        if(ricambio.getCodice().equals(codice))
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
   
        //Salvo tutto (l'ArrayList) nel file 
        
        SalvaSuFile();
        
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
        Ricambio articolo;
        articolo = magazzino.get(i);
        s += articolo.toString();
        
        
        //Se non sono sull'ultimo prodotto metto il ritorno a capo.                
        s = s + "\r\n";
           
        }    
    return s;    
    //Questo metodo converte l'articolo in stringa 
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
//Metodo per restituisre un array list di tipo ricambio dal file




private ArrayList<Ricambio> leggiDaFile() 
    {
        //Eccezzioni try e catch
        //Creaiamo un ArrayList vuoto
            ArrayList<Ricambio> articoli;
            articoli = new ArrayList(0);
            
        //Usiamo l'oggetto di tipo file reader (gli passiamo il nome del file)
        FileReader fileReader;
        
        try {
            
            
            
            
            //Cotruiamo il fileReader e gli passiamo
            
            fileReader = new FileReader ("archivio.csv");
           
            //Creiamo l'oggetto buffer reader
            
            BufferedReader input;
            input = new BufferedReader(fileReader);
            
            //Leggiamo linae per linea
            
            String linea;
            String campi[];
            
            //Legge la linea dal file e la assegna alla linea, se è uguale a null (niente) esce dal file (perché arrivato alla fine delle righe)
            while( (linea = input.readLine()) != null)
                {
                
                
                //Dividiamo i campi 
                
                campi = linea.split(",");
                
                //Es in campi[0] ci sarà il codice dell'articolo
                //Eh via così per campi[ ......]
                
                //Converto le due stringhe in intero per la quantità, e in float per il prezzo e per il peso
                int quantita = Integer.parseInt(campi[1]);
                float peso = Float.parseFloat(campi[3]);
                float prezzo = Float.parseFloat(campi[6]);
                
                
                
                //Ora creo l'articolo
                
                Ricambio ricambio = new Ricambio(campi[0], quantita, campi[2], peso, campi[4], campi[5], prezzo);
                
                articoli.add(ricambio);
                }   
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivio.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    //Diamo l'array in return
        return articoli;  
    }

    //Metodo che salva tutti i dati nel file archivio.csv
    
    private void SalvaSuFile()
        {
         FileWriter out;
        try {
            //Prende l'oggetto magazzino e lo salva sotto forma di stringa nel file (usiamo il metodo che abbiamo costruito toString)
            
            //Creiamo un oggetto per  scrivere sul file
           
            
            //Mettiamo tutto in un try-catch
            
            
            out = new FileWriter("archivio.csv");
            
            //Stringa archivio
            String sArchivio;
            
            //Richiamiamo il metodo toString
            sArchivio = toString();
            
            
            //Ora scriviamo nel file la stringa
            
            out.write(sArchivio);
            
            //Chiudo il file
            
            out.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Archivio.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
         
        }


}
