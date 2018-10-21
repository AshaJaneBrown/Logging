package Myropolska.Anna;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Test {
    private static Logger logger = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        logger.setLevel(Level.DEBUG);

        Hobby reading = new Hobby("reading");
        logger.info("A hobby has been created");
        Hobby dancing = new Hobby("Dancing", 2);
        logger.info("A hobby has been created");
        Hobby singing = new Hobby("Singing", 3, 7);
        logger.info("A hobby has been created");

        logger.debug("All hobbies have been created");

        try {
            System.out.println();
            reading.tellAboutHobby();
            dancing.tellAboutHobby();
            singing.tellAboutHobby();
            System.out.println();

            logger.debug("Information about hobbies has been displayed");
        }

        catch (Exception e) {
            logger.error("Information about hobbies has not been displayed");
        }


    }
}
