package alarmclock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xavi
 */
public class AlarmHourState implements AlarmClock{
    Clock clock;
    public AlarmHourState(Clock clock){
        this.clock = clock;
    }
            
    @Override
    public String readDisplay() {
        return clock.displayAlarm();
    }

    @Override
    public void AlarmSet() {
        clock.setAlarmClockState(clock.getAlarmMinuteState());
    }

    @Override
    public void ClockSet() {
        clock.setAlarmClockState(clock.getClockHourState());
    }

    @Override
    public void increase() {
        int hourPlusOne = clock.getAlarmHour() + 1;
        if(hourPlusOne == 12)
            clock.changeMode();
        if(hourPlusOne == 13){
            hourPlusOne = 1;
        }
        clock.setAlarmTime(hourPlusOne,clock.getAlarmHour());
    }

    @Override
    public void decrease() {
        int hourMinusOne = clock.getAlarmHour() - 1;
        if(hourMinusOne < 1){
            hourMinusOne = 12;
            clock.changeMode();
        }
        clock.setAlarmTime(hourMinusOne, clock.getAlarmHour());
    }
    
}
