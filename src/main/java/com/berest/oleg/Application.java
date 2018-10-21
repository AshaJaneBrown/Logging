package com.berest.oleg;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Application {
    final static Logger logger = Logger.getLogger(Application.class);
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Application application = new Application();
        application.logMethod("parameter");
    }

    public void logMethod(String parameter){
        if(logger.isDebugEnabled())
            logger.debug("Debug mode: " + parameter);

        if(logger.isInfoEnabled())
            logger.info("Info mode: " + parameter);

        logger.warn("Warn mode: " + parameter);

        logger.error("Error mode: " + parameter);

        logger.fatal("Fatal mode: " + parameter);

        try {
            int s = 20/0;
        } catch (ArithmeticException ex){
            logger.error("Here exception: " , ex);
        }
    }
}
