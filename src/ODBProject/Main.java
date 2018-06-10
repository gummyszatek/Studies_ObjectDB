package ODBProject;

import javax.persistence.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		EntityManagerFactory emf_student = 
				Persistence.createEntityManagerFactory("$objectdb/db/Students.odb");
		
		EntityManager em_student = emf_student.createEntityManager();
		
		EntityManagerFactory emf_worker = 
				Persistence.createEntityManagerFactory("$objectdb/db/Workers.odb");
		
		EntityManager em_worker = emf_worker.createEntityManager();
		
		EntityManagerFactory emf_faculty = 
				Persistence.createEntityManagerFactory("$objectdb/db/Faculties.odb");
		
		EntityManager em_faculty = emf_faculty.createEntityManager();
		
		EntityManagerFactory emf_course = 
				Persistence.createEntityManagerFactory("$objectdb/db/Courses.odb");
		
		EntityManager em_course = emf_course.createEntityManager();
		
		EntityManagerFactory emf_circle = 
				Persistence.createEntityManagerFactory("$objectdb/db/ScientificCircles.odb");
		
		EntityManager em_circle = emf_circle.createEntityManager();
		
		//-----------------------------------------------------------------------
		
		em_student.getTransaction().begin();
		for(int i = 0; i < 5; i++)
		{
			Faculty f = new Faculty("Wydzial elektrotechniki");
			Student s = new Student("Anna", "P", 25, f, "Grupa");
			em_student.persist(s);
		}
		
		em_student.getTransaction().commit();
		
		Query q1 = em_student.createQuery("SELECT COUNT(p) FROM Student p");
		System.out.println("Liczba studentów: " + q1.getSingleResult());
		
		//-----------------------------------------------------------------------
		
		em_student.close();
		emf_student.close();		
		
		em_worker.close();
		emf_worker.close();
		
		em_faculty.close();
		emf_faculty.close();
		
		em_circle.close();
		emf_circle.close();
		
		em_course.close();
		emf_course.close();		
	}
}
