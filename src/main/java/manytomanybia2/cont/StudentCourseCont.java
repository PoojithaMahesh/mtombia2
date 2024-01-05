package manytomanybia2.cont;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybia2.dao.CoursesDao;
import manytomanybia2.dao.StudentDao;
import manytomanybia2.dto.Course;
import manytomanybia2.dto.Student;

public class StudentCourseCont {
public static void main(String[] args) {
//	Student student1=new Student();
//	student1.setId(1);
//	student1.setName("Mahadev");
//	student1.setAddress("Bang");
//	
//	Student student2=new Student();
//	student2.setId(2);
//	student2.setName("Sandhya");
//	student2.setAddress("Bang");
//	
//	Course course1=new Course();
//	course1.setId(1);
//	course1.setName("Java");
//	course1.setFees(4000);
//	
//	Course course2=new Course();
//	course2.setId(2);
//	course2.setName("AdvanceJava");
//	course2.setFees(4000);
//	
//	List<Course> courses=new ArrayList<Course>();
//	courses.add(course1);
//	courses.add(course2);
//	
//	student1.setCourses(courses);
//	student2.setCourses(courses);
//	
//	
//	
//	
//	List<Student> students=new ArrayList<Student>();
//	students.add(student1);
//	students.add(student2);
//	
//	course1.setStudents(students);
//	course2.setStudents(students);
//	
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(course1);
//	entityManager.persist(course2);
//	entityManager.persist(student1);
//    entityManager.persist(student2);
//	entityTransaction.commit();
//	Student student1=new Student();
//
//	student1.setName("dev");
//	student1.setAddress("Mysore");
//	
//	
//	StudentDao studentDao=new StudentDao();
////	studentDao.updateStudent(1, student1);
//	
//	CoursesDao coursesDao=new CoursesDao();
//	coursesDao.deleteCourses(1);
//	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.find(Student.class, 1);
	entityManager.find(Student.class, 1);
	entityManager.find(Student.class, 1);
	entityManager.find(Student.class, 1);
	entityManager.find(Student.class, 1);
	
	
	EntityManager entityManager1=entityManagerFactory.createEntityManager();
	
	entityManager1.find(Student.class, 1);
	entityManager1.find(Student.class, 1);
	entityManager1.find(Student.class, 1);
	entityManager1.find(Student.class, 1);
	entityManager1.find(Student.class, 1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
