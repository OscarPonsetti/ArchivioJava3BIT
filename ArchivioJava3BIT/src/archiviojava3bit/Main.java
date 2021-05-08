package archiviojava3bit;

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
        
	//chiedo la conferma dell'esecuzione del programma      
        System.out.println("Inserisci un numero minore di 8 se vuoi eseguire il programma:");
        confermaEsecuzione = new Scanner(System.in).useDelimiter("\n");
        decisione = confermaEsecuzione.nextInt();
       
       
        
        while (comando>decisione)
        {
               
        scelta = menu();
                
        switch (scelta) 
            {
            case 1:
            
            break;
           
            case 2:
            
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
            System.out.println("Vuoi ancora eseguire il programma, se si metti un numero minore di 8");
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
        System.out.println("►Con questo programma potrai gestire un archivio di ricambi per Mountain Bike ☻☻☻☻☻☻    ◄");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 1)Visualizzare elenco articoli;                                                           ║");
        System.out.println("║ 2)Inserire un ricambio;                                                                   ║");
        System.out.println("║ 3)Elimina un ricambio                                                                     ║"); 
        System.out.println("║ 4)Cercare un ricambio in base al prezzo;                                                  ║");
        System.out.println("║ 5)Cercare un ricambio in base al nome;                                                    ║");
        System.out.println("║ 6)Cercare un ricambio in base all'uso;                                                    ║");
        System.out.println("║ 7)Modificare un ricambio;                                                                 ║");
        System.out.println("║ 8)Uscita dal programma.                                                                   ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("Scegli l'opzione desiderata:");
        tastiera = new Scanner(System.in).useDelimiter("\n");
        sceltaut = tastiera.nextInt();     //converte in numero intero il valore inserito da tastiera
        System.out.println("\n");
        return sceltaut;
    }
    
}
