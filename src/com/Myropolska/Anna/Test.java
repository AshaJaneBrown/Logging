package Myropolska.Anna;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Test {
    private static Logger logger = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        Hobby[] hobbies = new Hobby[2];
        hobbies[0] = new Fishing("Lake");
        hobbies[1] = new Football("Real Madrid");

        for (Hobby hobby: hobbies) {
            hobby.tellAboutHobby();
        }
        logger.setLevel(Level.DEBUG);
        logger.info("Information about hobbies has been displayed displayed.");
    }

}

