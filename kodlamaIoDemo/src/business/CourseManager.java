package business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoDemo.core.logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;

public class CourseManager {
        private CourseDao courseDao;
        private Logger[] loggers;

        List<String> courses = new ArrayList<String>();

        public CourseManager(CourseDao courseDao, Logger[] loggers) {
            this.courseDao = courseDao;
            this.loggers = loggers;
        }

        public boolean isNameValid(Course course) {
                for(String name : courses) {
                        if(name == course.getName()) {
                            return false;
                        }
                }
                return true;
        }

        public boolean isPriceCheck(Course course) {
                if(course.getPrice() < 0) {
                        return false;
                }
                return true;
        }

        public void add(Course course) throws Exception {

            if(isNameValid(course) == true && isPriceCheck(course) == true) {
                    courses.add(course.getName());
                    courseDao.add(course);
                    System.out.println("Course added");
                    for(Logger logger : loggers) {
                            logger.log(course.getName());
                    }
            } else {
                    throw new Exception("Course price can't be less than 0 or added an existing course.");  
            }
        }
}
