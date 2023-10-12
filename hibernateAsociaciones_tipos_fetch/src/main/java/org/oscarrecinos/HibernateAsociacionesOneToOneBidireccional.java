package org.oscarrecinos;

import jakarta.persistence.EntityManager;
import org.oscarrecinos.entity.Cliente;
import org.oscarrecinos.entity.ClienteDetalle;
import org.oscarrecinos.util.JpaUtil;

public class HibernateAsociacionesOneToOneBidireccional {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();

            Cliente cliente = new Cliente("Cata", "Edu");
            cliente.setFormaPago("paypal");

            ClienteDetalle detalle = new ClienteDetalle(true, 8000L);

            /* 
            Esta onda deberia ser un curso de mecanografía
            */
            cliente.addDetalle(detalle);
            em.persist(cliente);
            em.getTransaction().commit();

            System.out.println(cliente);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}
