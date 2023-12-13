package Domenico.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Location {

    @Id
    @GeneratedValue
    private long idLocation;

    private String nomeLocazione;

    private String citta;


    public Location(String citta,String nomeLocazione) {
        this.citta = citta;
        this.nomeLocazione=nomeLocazione;
    }

    public Location(){

    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getNomeLocazione() {
        return nomeLocazione;
    }

    public void setNomeLocazione(String nomeLocazione) {
        this.nomeLocazione = nomeLocazione;
    }
}



