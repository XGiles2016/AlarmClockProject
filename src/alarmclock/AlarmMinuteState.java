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
public class AlarmMinuteState implements AlarmClock {
    Clock clock;
    public AlarmMinuteState(Clock clock){
        this.clock = clock;
    }
    @Override
    public String readDisplay() {
        return clock.displayTime();
    }

    @Override
    public void AlarmSet() {
        clock.setAlarmClockState(clock.getDisplayState());
    }

    @Override
    public void ClockSet() {
        clock.setAlarmClockState(clock.getClockHourState());
    }

    @Override
    public void increase() {
        int minutePlusOne = clock.getAlarmMinute() + 1;
        if(minutePlusOne == 60)
            minutePlusOne = 00;
        clock.setAlarmTime(clock.getAlarmHour(), minutePlusOne);
    }

    @Override
    public void decrease() {
        int minuteMinusOne = clock.getAlarmMinute() - 1;
        if(minuteMinusOne < 0)
            minuteMinusOne = 59;
        clock.setAlarmTime(clock.getAlarmHour(), minuteMinusOne);
    }
    
}
