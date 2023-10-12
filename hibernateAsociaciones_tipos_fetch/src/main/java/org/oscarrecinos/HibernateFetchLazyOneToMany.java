package org.oscarrecinos;

import jakarta.persistence.EntityManager;
import org.oscarrecinos.entity.Cliente;
import org.oscarrecinos.util.JpaUtil;

public class HibernateFetchLazyOneToMany {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        Cliente cliente = em.find(Cliente.class, 1L);
        System.out.println("a");
        System.out.println(cliente.getNombre() + ", direcciones: "+cliente.getDirecciones());
        System.out.println("a");

    }
}
