package ODBProject;

import javax.persistence.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("$objectdb/db/Student.odb");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		for(int i = 0; i < 5; i++)
		{
			Faculty f = new Faculty("Wydzial elektrotechniki");
			Student s = new Student("Anna", "P", 25, f, "Grupa");
			em.persist(s);
		}
		
		em.getTransaction().commit();
		
		Query q1 = em.createQuery("SELECT COUNT(p) FROM Student p");
		System.out.println("Liczba studentów: " + q1.getSingleResult());
		
		em.close();
		emf.close();
	}
}
