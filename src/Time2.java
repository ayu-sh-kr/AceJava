import java.sql.Time;

public class Time2 {
    private int hour; // 0-23
    private int minute;// 0-59
    private int second; // 0-59

    // Time2cno argument constructor
    // initializes each instance variable to zero
    public Time2(){
        this(0, 0, 0);
    }

    // Time 2 constructor hour supplied, minute and second defaulted to 0
    public Time2(int hour){
        this(hour, 0, 0);
    }

    //Time2 constructor hour, minute supplied, second defaulted to zero
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }

    // Time2 constructor hour, minute, second supplied
    public Time2(int hour, int minute, int second){
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("second mus be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Time2 constructor: another Time2 object supplied
    public Time2(Time2 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // get hour value
    public int getHour() {
        return hour;
    }

    // set hour value
    public void setHour(int hour) {
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // set minute value
    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.minute = minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // set second value
    public void setSecond(int second) {
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("second mus be 0-59");
        }

        this.second = second;
    }

    // convert to String in universal time format
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",getHour(), getMinute(), getSecond());
    }

    // convert to String in standard time format(H:MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                (getHour() == 0 || getHour() == 12) ? 12 : (getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}// end class Time2
