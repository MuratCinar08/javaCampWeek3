package business;

import kodlamaIoDemo.core.logging.Logger;
import dataAccess.instructor.InstructorDao;
import entities.Instructor;

public class InstructorManager {
        private InstructorDao instructorDao;
        private Logger[] loggers;

        public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
                this.instructorDao = instructorDao;
                this.loggers = loggers;
        }

        public void add(Instructor instructor) {
                for(Logger logger : loggers) {
                        logger.log(instructor.getName());
                }
        }
}
