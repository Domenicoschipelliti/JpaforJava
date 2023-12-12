package Domenico;

import Domenico.dao.GestioneEventiDAO;
import Domenico.entities.GestioneEventi;
import Domenico.entities.tipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {

    private static  final EntityManagerFactory mana= Persistence.createEntityManagerFactory("Jpa");
     //responsabile del database

    public static void main(String[] args) {
        EntityManager ma=mana.createEntityManager();
        GestioneEventi event=new GestioneEventi(5, tipoEvento.PUBBLICO, LocalDate.of(2023,12,31),"bella e bestia","bella sposa la bestia");
        GestioneEventi eve=new GestioneEventi(5, tipoEvento.PRIVATO, LocalDate.of(2023,1,2),"Incontro","Amico");
        GestioneEventi even=new GestioneEventi(10, tipoEvento.PUBBLICO, LocalDate.of(2023,9,10),"Teatro","Sain't Gabriel");
        GestioneEventiDAO ao= new GestioneEventiDAO(ma);

        ao.save(event);
        ao.save(even);
        ao.save(eve);

        ma.close();


    }
}
