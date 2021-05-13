package archiviojava3bit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Si occupa dell'interfaccia utente con un menu.
 * Qui si può usare println
 * @author Oscar Ponsetti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args)
    {
        
  int scelta;
       Scanner confermaEsecuzione;
        int comando,decisione;
	comando =8;
        
        //Creo l'archivio
        
        Archivio archivio;
        archivio = new Archivio();
                     
	//chiedo la conferma dell'esecuzione del programma      
        System.out.println("┌─────────────────────────────────────────────────────────────────────────┐");
        System.out.println("|Inserisci un numero minore di 8 se vuoi eseguire il programma:|");
        System.out.println("└─────────────────────────────────────────────────────────────────────────┘");
        confermaEsecuzione = new Scanner(System.in).useDelimiter("\n");
        decisione = confermaEsecuzione.nextInt();
       
        Scanner tastiera;
        tastiera = new Scanner (System.in);
        
       
        
        while (comando>decisione)
        {
               
        scelta = menu();
                
        switch (scelta) 
            {
            case 1:
            //Prima opzione (Visualizzare l'elenco di tutti i ricambi nel magazzino)
            
            // Chiedo alla classe Archivio l'elenco di tutti gli articoli 
            ArrayList<Ricambio> elencoRicambio;
            
            //Popolo il mio ArrayList elencoRicambio usando il metodo elencoRicambi contenuto nella classe Archivio
            
            elencoRicambio = archivio.elencoRicambi();
            
            //Stampo l'ArrayList col metodo stampaElencoRicambi gli passo (elencoRicambio)
            
            stampaElencoRicambi(elencoRicambio);
                
            break;
           
            case 2:
            //Scelta 2 per inserire un articolo scelto dall'utente
            //Chiedo all'utente i dati del ricambio che vuole inserire
            System.out.print("Inserisci il codice: ");
            String codice = tastiera.nextLine();  
            System.out.print("Inserisci la quantità: ");
            int quantita = Integer.parseInt(tastiera.nextLine());   
            System.out.print("Inserisci il nome:  P.S 36 caratteri per mantenere l'ordine nella stampa ");
            String nome = tastiera.nextLine();
            System.out.print("Inserisci il peso: ");
            float peso = Float.parseFloat(tastiera.nextLine());
            System.out.print("Inserisci il materiale: ");
            String materiale = tastiera.nextLine();
            System.out.print("Inserisci l'uso: ");
            String uso = tastiera.nextLine();   
            System.out.print("Inserisci il prezzo: ");
            float prezzo = Float.parseFloat(tastiera.nextLine());
            
            //Ora creo un oggetto articolo con le caratteristiche inserite dall'utente 
            
            Ricambio ricambio = new Ricambio (codice, quantita, nome, peso, materiale, uso, prezzo);
            
            //Ora lo aggiungo al mio ArrayList e do la conferma se è stato inserito correttamente
            
            if(archivio.inserimento(ricambio))
                {
                System.out.println("Articolo inserito correttamente");
                }
            else
            {
            System.out.println("Esiste gia un articolo con lo stesso codice !");
            
            }
 
            break;

            case 3:
            
                
                
                
                
                
                
                
                
            break;

            case 5:
            
            break;

            case 6:
            
            break;
        
            case 7:
            
            break;
             
                           
            }
        if(scelta == 8 )
            {
            decisione=8;
            }
            else
                {
            System.out.println("Vuoi ancora eseguire il programma?, se si metti un numero minore di 8");
            confermaEsecuzione = new Scanner(System.in).useDelimiter("\n");
            decisione = confermaEsecuzione.nextInt();
                }
        }
      
    }
private static int menu() 
    {
        int sceltaut;
        Scanner tastiera;
        System.out.println("\n");
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("╠░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╣");
        System.out.println("║Con questo programma potrai gestire un archivio di ricambi per Mountain Bike ☻☻☻☻☻☻     ║");
        System.out.println("╠░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╣");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1)Visualizzare elenco articoli;                                                           ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 2)Inserire un ricambio;                                                                   ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 3)Elimina un ricambio                                                                     ║"); 
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 4)Cercare un ricambio in base al prezzo;                                                  ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 5)Cercare un ricambio in base al nome;                                                    ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 6)Cercare un ricambio in base all'uso;                                                    ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 7)Modificare un ricambio;                                                                 ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 8)Uscita dal programma.                                                                   ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("Scegli l'opzione desiderata:");
        tastiera = new Scanner(System.in).useDelimiter("\n");
        sceltaut = tastiera.nextInt();     //converte in numero intero il valore inserito da tastiera
        System.out.println("\n");
        return sceltaut;
    }


private static void stampaElencoRicambi(ArrayList<Ricambio> elencoRicambio)
    {
    //Questo metodo statico si occupa di stampare ogni elemento dell'ArrayList che contiene i ricambi
        
    System.out.println("|N:|\t|Codice|\t|Quantità|\t|               Nome                 |\t\t| Peso  \t|Materiale |\t|    Uso    |\t|Prezzo|");
        
    //Con un ciclo for sfogliamo tutto l'ArrayList
    int i;
    
    for(i=0;i<elencoRicambio.size();i++)
        {
        //Stampimo per ogni elemento dell'ArrayList le sue caratteristice
        System.out.print("| " + (i + 1) + "|");
        //Prendo il primo ricambio contenuto nell'ArrayList con .get(i); successivamente di quel ricambio voglio sapere il codice... (getCodice)
        System.out.print("\t" + "|"+ elencoRicambio.get(i).getCodice() + "  |");    
        System.out.print("\t" + "|   " + elencoRicambio.get(i).getQuantita() + "    |");
        System.out.print("\t" + "| " + elencoRicambio.get(i).getNome() + "|");
        
        //System.out.format("%-5s:%10s\n", ");      Non riesco ad implementarla
        
        System.out.print("\t\t" + "|" + elencoRicambio.get(i).getPeso());
        System.out.print("\t\t" + "| " + elencoRicambio.get(i).getMateriale());
        System.out.print("\t" + "|  " + elencoRicambio.get(i).getUso());
        System.out.println("\t" + "| " + elencoRicambio.get(i).getPrezzo() + " |");
        
        
        
        
        
        }
            
    System.out.println("\n");       
    }




}
