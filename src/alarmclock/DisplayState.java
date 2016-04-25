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
public class DisplayState implements AlarmClock {
    Clock clock;
    public DisplayState(Clock clock){
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
        clock.setAlarmClockState(clock.getClockHourState());
    }

    @Override
    public void increase() {
        System.out.println("Please choose which mode you would like to increase");
    }

    @Override
    public void decrease() {
        System.out.println("Please choose which mode you would like to decrease");
    }
    
}
