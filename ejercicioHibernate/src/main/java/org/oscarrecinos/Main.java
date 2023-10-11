package org.oscarrecinos;

import jakarta.persistence.EntityManager;
import org.oscarrecinos.entity.*;
import org.oscarrecinos.util.JpaUtil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Student estudiante = new Student("Oscar","Recinos");
            Student estudiante2 = new Student("Miguel","Cader");

            Marks mark1 = new Marks(10);
            Marks mark2 = new Marks(5);

            Subject matematica = em.find(Subject.class,1L);
            Subject programacion = em.find(Subject.class,2L);

            Teacher ingReci = em.find(Teacher.class,1L);

            mark1.setSubject(matematica);
            mark1.setStudent(estudiante);
            mark1.setDate(LocalDate.now());

            mark2.setSubject(programacion);
            mark2.setStudent(estudiante2);
            mark2.setDate(LocalDate.now());

            Group grupo =  em.find(Group.class,1L);
            Group grupo2 =  em.find(Group.class,2L);

            SubjectXTeacher aula = new SubjectXTeacher();
            aula.setGroup(grupo);
            aula.setTeacher(ingReci);
            aula.setSubject(programacion);

            estudiante.setGroupId(grupo);
            estudiante2.setGroupId(grupo2);


            em.persist(estudiante);
            em.persist(estudiante2);
            em.persist(mark1);
            em.persist(mark2);
            em.persist(aula);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Marks mark = em.find(Marks.class,1L);
            Marks marka2 = em.find(Marks.class,2L);
            Group grupo3 = em.find(Group.class,3L);
            SubjectXTeacher aulaPrueba = em.find(SubjectXTeacher.class, 1L);
            Student maicol = em.find(Student.class,2L);
            Subject poo2 = em.find(Subject.class,3L);
            Teacher ronald = em.find(Teacher.class,2L);

            System.out.println("\nCalificacion 1 :" + mark);
            System.out.println("Calificacion 2 :" + marka2);
            System.out.println("SUBJECT / Teacher  :" + aulaPrueba);
            System.out.println("Estudiante id_2 = " + maicol );
            System.out.println("Materia id_3 = " + poo2);
            System.out.println("Teacher id_2 = " + ronald);
            System.out.println("Grupo 3 : " + grupo3);



        }catch (Exception e){
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
    }
}