package archiviojava3bit;

/**
 * Classe utilizzata per l'oggetto da contenere nella collezione.
 * Contiene le varibili di istanza, il metodo costruttore, i setter/getter
 * e eventuali altri metodi
 * @author Oscar Ponsetti
 */
public class Ricambio 
{
//Variabili di istanza
//Ogni ricambio dovrà avere delle caratteristiche 4 - 5 caratteristiche

//Codice 
private String codice;// "ART20232B"

//Quantità 
private int quantita;
    
//1) Un nome del prodotto 
private String nome;

//2) Il peso  del componente
private float peso;

//3) Materiale del componente
private String materiale;

//4) L'utilizzo del componente "Gravity(dowhnill), Cross-Country, Enduro, Gravel"
private String uso;

//5) Prezzo
private float prezzo;

//Metodo costruttore
public Ricambio(String codice,int quantita , String nome, float peso, String materiale, String uso, float prezzo)
    {
    this.codice=codice;
    this.quantita=quantita;
    this.nome=nome;
    this.peso=peso;
    this.materiale=materiale;
    this.uso=uso;
    this.prezzo=prezzo;
    }

//Metodi getter
public String getCodice()
    {
    return codice;
    }
public int getQuantita()
    {
    return quantita;
    }
public String getNome()
    {
    return nome;
    }
public float getPeso()
    {
    return peso;
    }
public String getMateriale()
    {
    return materiale;
    }
public String getUso()
    {
    return uso;
    }
public float getPrezzo()
    {
    return prezzo;
    }

//Metodi setter
public void setCodice(String codice)
    {
    this.codice=codice;    
    }

public void setQuantita(int quantita)
    {
    this.quantita=quantita;
    }

public void setNome(String nome)
    {
    this.nome=nome;
    }

public void setPeso(float peso)
    {
    this.peso=peso;
    }   

public void setMateriale(String materiale)
    {
    this.materiale=materiale;
    }

public void setUso(String uso)
    {
    this.uso=uso;
    }   

public void setPrezzo(float prezzo)
    {
    this.prezzo=prezzo;
    }


}
