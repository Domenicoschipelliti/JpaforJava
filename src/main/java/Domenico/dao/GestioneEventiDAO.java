package Domenico.dao;

import Domenico.entities.GestioneEventi;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GestioneEventiDAO {
    private EntityManager mana;
    public GestioneEventiDAO(EntityManager mana){
        this.mana=mana;
    }

    public void save(GestioneEventi eventi){
        EntityTransaction transaction= mana.getTransaction();
        transaction.begin();
        mana.persist(eventi);
        transaction.commit();
        System.out.println("Evento " + eventi.getTitolo() + " aggiunto correttamente!");
    }

    public GestioneEventi findById(long id) {
        // SELECT * FROM students WHERE id = 1 come corrisponde in linguaggio SQL
        return mana.find(GestioneEventi.class, id);
    }

}
