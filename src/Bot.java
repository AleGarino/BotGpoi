import java.io.*;
import java.util.*;
import java.lang.*;
public class Bot {
    private String nome = null;         //Nome Del bot personalizzabile
    private int id = 1;                 //id del bot, deve essere maggiore di zero altrimenti è umano
    private ArrayList<Soldi> denaro = null;        //I soldi che avrà poi i bot
    private ArrayList<CartaProprietà> numCarte = null;      //numero delle carte proprietà che ha il bot

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Soldi> getDenaro() {
        return denaro;
    }

    public void setDenaro(ArrayList<Soldi> denaro) {
        this.denaro = denaro;
    }

    public ArrayList<CartaProprietà> getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(ArrayList<CartaProprietà> numCarte) {
        this.numCarte = numCarte;
    }

    public Bot() {      //costruttore di default
    }

    public Bot(String nome, int id, ArrayList<Soldi> denaro, ArrayList<CartaProprietà> numCarte) {     //costruttore di parametri
        this.nome = nome;
        this.id = id;
        this.denaro = denaro;
        this.numCarte = numCarte;
    }

    @Override                               //per stampare su console un bot
    public String toString() {
        return "Bot{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", denaro=" + denaro +
                ", numCarte=" + numCarte +
                '}';
    }

    public int numRandom(int min, int max) {
         Random random = new Random();
         return random.nextInt(min)
    }

}

