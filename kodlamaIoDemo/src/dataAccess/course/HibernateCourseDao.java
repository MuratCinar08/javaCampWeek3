package dataAccess.course;

import entities.Course;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Added to database with Hibernate");
        
    }
    
}
