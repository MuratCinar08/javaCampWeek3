package dataAccess.instructor;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
            System.out.println("Added to database with Jdbc ");
        
    }
    
}
