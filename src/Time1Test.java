public class Time1Test {
    public static void main(String[] args) {

        //create and initialize a Time1 object
        Time1 time = new Time1();

        // output string representation of time
        displayTime("After the object is created", time);
        System.out.println();

        // change time and output updated time
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        // attempt to set time with invalid value
        try{
            time.setTime(99, 99, 99);
        }catch (Exception e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        // display time after attempt to set invalid values
        displayTime("After calling setTime with invalid values", time);
    }

    private static void displayTime(String s, Time1 time) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                s, time.toUniversalString(), time.toString());
    }

}
