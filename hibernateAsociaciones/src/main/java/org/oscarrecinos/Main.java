package org.oscarrecinos;

import jakarta.persistence.EntityManager;
import org.oscarrecinos.entity.Cliente;
import org.oscarrecinos.util.JpaUtil;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        var a = em.createQuery("SELECT c FROM Cliente c ", Cliente.class).getResultList();
        em.merge(new Cliente("Oscar","Recinos"));
        em.persist(new Cliente("Oscar","Recinos"));
        var b = em.createQuery("SELECT c FROM Cliente c ", Cliente.class).getResultList();

        System.out.println(b);

    }
}