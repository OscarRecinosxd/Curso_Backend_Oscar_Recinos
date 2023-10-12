package org.oscarrecinos;

import jakarta.persistence.EntityManager;
import org.oscarrecinos.entity.Cliente;
import org.oscarrecinos.entity.Factura;
import org.oscarrecinos.util.JpaUtil;

public class HibernateAsociacionesManyToOneFind {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class,1L);
            Factura factura = new Factura("Compras de oficina",1000L);
            factura.setCliente(cliente);
            em.persist(factura);

            System.out.println(factura.getCliente());
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
