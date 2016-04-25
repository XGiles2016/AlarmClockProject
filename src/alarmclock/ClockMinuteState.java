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
public class ClockMinuteState implements AlarmClock {
    Clock clock;
    public ClockMinuteState(Clock clock){
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
        clock.setAlarmClockState(clock.getDisplayState());
    }

    @Override
    public void increase() {
        int minutePlusOne = clock.getClockMinute() + 1;
        if(minutePlusOne == 60)
            minutePlusOne = 0;
        clock.setTime(clock.getClockHour(), minutePlusOne);
    }

    @Override
    public void decrease() {
        int minuteMinusOne = clock.getClockMinute() - 1;
        if(minuteMinusOne < 0)
            minuteMinusOne = 59;
        clock.setTime(clock.getClockHour(), minuteMinusOne);
    }
}
