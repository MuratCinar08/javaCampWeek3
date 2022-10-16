package dataAccess.category;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
            System.out.println("Added to database with Hibernate ");
        
    }
    
}
