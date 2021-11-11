package creationAndDestructionOftheObjects;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class NonInstantiabilityClass {

    // Noninstantiable utility class
    public static  class UtilityClass {
        // Suppress default constructor for noninstantiability
        private UtilityClass() {
// This constructor will never be invoked
        }

    }

    class Person {
        private final Date birthDate;
        public Person(Date birthDate) {
            this.birthDate = birthDate;
        }
        /**
         * The starting and ending dates of the baby boom.
         */
        private static final Date BOOM_START;
        private static final Date BOOM_END;
        static {
            Calendar gmtCal =
                    Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
            BOOM_START = gmtCal.getTime();
            gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
            BOOM_END = gmtCal.getTime();
        }
        public boolean isBabyBoomer() {
            return birthDate.compareTo(BOOM_START) >= 0 &&
                    birthDate.compareTo(BOOM_END) < 0;
        }
    }
}
