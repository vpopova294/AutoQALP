package logger_enum;

import java.util.logging.Logger;
import java.lang.System.Logger.Level;

import static java.lang.System.Logger.Level.ERROR;


public class circleArea {
        public static void main(String[] args) {


            final Logger LOGGER = Logger.getLogger(circleArea.class.getName());
            int a = 5, b = 2;
            //double a1 = 2.5, b1 = 3;
            double pi = 3.14;

            LOGGER.log(ERROR, "show log error");

            System.out.println(pi * Math.pow(a,b));
            //System.out.println((double) Math.pow(a1,b1));
        }
    }

