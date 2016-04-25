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
public class ClockHourState implements AlarmClock {
    Clock clock;
    public ClockHourState(Clock clock){
        this.clock = clock;
    }
    @Override
    public String readDisplay() {
        return clock.displayTime();
    }

    @Override
    public void AlarmSet() {
        clock.setAlarmClockState(clock.getAlarmHourState());
    }

    @Override
    public void ClockSet() {
        clock.setAlarmClockState(clock.getClockMinuteState());
    }

    @Override
    public void increase() {
        int hourPlusOne = clock.getClockHour() + 1;
        if(hourPlusOne == 12)
            clock.changeMode();
        if(hourPlusOne == 13){
            hourPlusOne = 1;
        }
        clock.setTime(hourPlusOne,clock.getClockMinute());
    }

    @Override
    public void decrease() {
        int hourMinusOne = clock.getClockHour() - 1;
        if(hourMinusOne == 0 ){
            hourMinusOne = 12;
            clock.changeMode();
        }
        clock.setTime(hourMinusOne, clock.getClockHour());
    }
}
