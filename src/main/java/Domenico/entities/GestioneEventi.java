package Domenico.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "gestioneeventi")
public class GestioneEventi {
    @Id //questa annotazione sta ad indicare che id(sotto) è una chiave primaria
    @GeneratedValue//<--questo farà gestire il valore di id automaticamente dal database che verrà aumentato di 1 ogni volta
    public long id;

    @Column //<---queste sono le colonne
    public String titolo;

    @Column
    public String descrizione;

    @Column
    public LocalDate dataEvento;

    @Column
    @Enumerated(EnumType.STRING)
    public tipoEvento tipo;

    @Column
    public int numeroMassimoPartecipanti;


    public GestioneEventi(int numeroMassimoPartecipanti,tipoEvento tipo,LocalDate dataEvento,String titolo,String descrizione) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.titolo=titolo;
        this.tipo=tipo;
        this.descrizione=descrizione;
        this.dataEvento=dataEvento;
    }

    public GestioneEventi(){

    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Domenico.entities.tipoEvento getTipoEvento() {
        return tipo;
    }

    public void setTipo(Domenico.entities.tipoEvento tipoEvento) {
        this.tipo = tipoEvento;
    }


    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }


    @Override
    public String toString() {
        return "GestioneEventi{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", dataEvento=" + dataEvento +
                ", tipoEvento=" + tipo +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
