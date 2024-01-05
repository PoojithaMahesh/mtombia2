package manytomanybia2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybia2.dto.Course;
import manytomanybia2.dto.Student;

public class CoursesDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	
	public void updateCourses(int id,Course course) {
		EntityManager entityManager=getEntityManager();
		Course dbCourse=entityManager.find(Course.class, id);
		if(dbCourse!=null) {
//			id is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			course.setId(id);
			course.setStudents(dbCourse.getStudents());
			entityManager.merge(course);
			entityTransaction.commit();
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	public void findCourses(int id) {
		EntityManager entityManager=getEntityManager();
		Course dbCourse=entityManager.find(Course.class, id);
		if(dbCourse!=null) {
//			id is present
			System.out.println(dbCourse);
		}else {
			System.out.println("sorry id is not present");
		}
	}
	public void deleteCourses(int id) {
		EntityManager entityManager=getEntityManager();
		Course dbCourse=entityManager.find(Course.class, id);
		if(dbCourse!=null) {
//			id is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			List<Student> students=dbCourse.getStudents();
			for(Student student:students) {
				List<Course> courses=student.getCourses();
//				courses=java adv sql
				courses.remove(dbCourse);
//			    courses=adv sql
				student.setCourses(courses);
			}
		
			entityManager.remove(dbCourse);
			entityTransaction.commit();
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	
	
	
	
}
