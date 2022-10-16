import business.CategoryManager;
import business.CourseManager;
import kodlamaIoDemo.core.logging.DatabaseLogger;
import kodlamaIoDemo.core.logging.Logger;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.course.HibernateCourseDao;
import entities.Category;
import entities.Course;



public class Main {
    public static void main(String[] args) {
        
          
		Logger[] loggers = {new DatabaseLogger()};	
		
		Category category1 = new Category(1, "React");
		Category category2 = new Category(2, "React");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		
		categoryManager.add(category1);
		categoryManager.add(category2);
		

		
		Course course = new Course(1,"JavaScript",85);
		Course course2 = new Course(2, "JavaScript", 158);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		
		courseManager.add(course); 
		courseManager.add(course2); 
    }
}
