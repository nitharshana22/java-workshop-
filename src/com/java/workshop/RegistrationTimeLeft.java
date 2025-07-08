package src.com.java.workshop;
import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[]args){
        LocalTime currentTime=LocalTime.now();
        LocalTime registrationEndTime=LocalTime.of(18,59,59);
        int hourLeft=registrationEndTime.getHour()-currentTime.getHour();
        int minuteLeft=registrationEndTime.getMinute()-currentTime.getMinute();
        int secondLeft=registrationEndTime.getSecond()-currentTime.getSecond();
        System.out.print("you have"+hourLeft+"hour,"+minuteLeft+"minutes,and"+secondLeft+"seconds left to register.");
    }
}
