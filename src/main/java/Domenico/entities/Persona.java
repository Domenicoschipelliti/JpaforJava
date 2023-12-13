package Domenico.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Persona {
    @Id
    @GeneratedValue
    private long idPersona;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate data_di_nascita;

    private Sesso sesso;

    List<GestioneEventi> eventis=new ArrayList<>();


    public Persona(String cognome,String nome,String email,LocalDate data_di_nascita,Sesso sessos,List<GestioneEventi> eventis) {
        this.cognome = cognome;
        this.email=email;
        this.eventis=eventis;
        this.nome=nome;
        this.data_di_nascita=data_di_nascita;
        this.sesso=sessos;
    }

    public  Persona(){

    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getData_di_nascita() {
        return data_di_nascita;
    }

    public void setData_di_nascita(LocalDate data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GestioneEventi> getEventis() {
        return eventis;
    }

    public void setEventis(List<GestioneEventi> eventis) {
        this.eventis = eventis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }
}
