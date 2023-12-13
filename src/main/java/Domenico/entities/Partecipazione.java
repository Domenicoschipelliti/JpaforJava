package Domenico.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Partecipazione {
    @Id
    @GeneratedValue
    private long idPartecipazione;

    private Persona persona;

    private GestioneEventi gestioneEventi;

    private Stato stato;


    public Partecipazione(GestioneEventi gestioneEventi,Persona persona,Stato stato) {
        this.gestioneEventi = gestioneEventi;
        this.persona=persona;
        this.stato=stato;

    }

    public Partecipazione(){

    }

    public GestioneEventi getGestioneEventi() {
        return gestioneEventi;
    }

    public void setGestioneEventi(GestioneEventi gestioneEventi) {
        this.gestioneEventi = gestioneEventi;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
}
