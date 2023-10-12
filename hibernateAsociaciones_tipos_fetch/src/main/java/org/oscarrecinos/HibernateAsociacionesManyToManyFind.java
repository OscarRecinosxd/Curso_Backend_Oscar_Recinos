package org.oscarrecinos;

import jakarta.persistence.EntityManager;
import org.oscarrecinos.entity.Alumno;
import org.oscarrecinos.entity.Curso;
import org.oscarrecinos.util.JpaUtil;

public class HibernateAsociacionesManyToManyFind {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Alumno a = em.find(Alumno.class,1L);
            Alumno b = em.find(Alumno.class,2L);

            Curso curso1 = em.find(Curso.class,1L);
            Curso curso2 = em.find(Curso.class,1L);
            a.getCursos().add(curso1);
            a.getCursos().add(curso2);
            b.getCursos().add(curso1);

            em.getTransaction().commit();

            System.out.println(a);
            System.out.println(b);

        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}
