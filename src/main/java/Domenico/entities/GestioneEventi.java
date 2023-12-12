package Domenico.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class GestioneEventi {
    @Id //questa annotazione sta ad indicare che id(sotto) è una chiave primaria
    public long id;
    @Column //<---queste sono le colonne
    public String titolo;

    @Column
    public String descrizione;

    @Column
    public Date dataEvento;

    @Column
    @Enumerated
    public tipoEvento tipoEvento;

    @Column
    public int numeroMassimoPartecipanti;

    public GestioneEventi() {
    }

    public GestioneEventi(Date dataEvento, String titolo,String descrizione,tipoEvento tipoEvento,int numeroMassimoPartecipanti) {
        this.dataEvento = dataEvento;
        this.titolo=titolo;
        this.descrizione=descrizione;
        this.tipoEvento=tipoEvento;
        this.numeroMassimoPartecipanti=numeroMassimoPartecipanti;



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

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Domenico.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Domenico.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }


    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
}
