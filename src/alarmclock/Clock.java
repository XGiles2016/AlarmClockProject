package alarmclock;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xavier
 */
public class Clock {
    private AlarmClock alarmHourState; //alarm hour state
    private AlarmClock alarmMinuteState; //alarm minute state
    private AlarmClock clockHourState; //clock hour state
    private AlarmClock clockMinuteState; // clock minute state
    private AlarmClock displayState; // default state for alarm clock
    private AlarmClock currentState;
    private int clockHour, clockMinute, alarmHour, alarmMinute;
    private boolean isPM;
    
    public Clock(){
        this.clockHour = 11;
        this.clockMinute = 30;
        this.alarmHour = 10;
        this.alarmMinute = 00;
        this.currentState = new DisplayState(this);
        alarmHourState = new AlarmHourState(this);
        alarmMinuteState = new AlarmMinuteState(this);
        clockHourState = new ClockHourState(this);
        clockMinuteState = new ClockMinuteState(this);
        displayState = new DisplayState(this);
        isPM = false;
    }
    
  
    public void setAlarmClockState(AlarmClock state){
        this.currentState = state;
    }
    
    public int getClockHour(){
        return this.clockHour;
    }

    public int getClockMinute(){
        return this.clockMinute;
    }

    public int getAlarmHour(){
        return this.alarmHour;
    }

    public int getAlarmMinute(){
        return this.alarmMinute;
    }

    public String displayTime(){
        String day = "";
        if(isPM == true)
            day = " PM";
        else
            day = " AM";
        String display = this.clockHour +":" + this.clockMinute + day;
        return display;
    }

    public String displayAlarm(){
        String day = "";
        if(isPM == true)
            day = " PM";
        else
            day = " AM";
        String display = alarmHour + ":" + alarmMinute + day;
        return display;
    }
    /**
     * Will set current clock time to this time as long as hour and minute are valid
     * @param hour
     * @param minute
     */
    public void setTime(int hour, int minute){
        if(hour < 13 && hour > 0 && minute >= 0 && minute < 60){
        this.clockHour = hour;
        this.clockMinute = minute;
        } 
        else 
            System.out.println("Please enter a valid time.");
    }

    /**
     * Will set current alarm time to this time as long as hour and minute are valid
     * @param hour
     * @param minute
     */
    public void setAlarmTime(int hour, int minute){
        if(hour < 13 && hour > 0 && minute >= 0 && minute < 60){
        this.alarmHour = hour;
        this.alarmMinute = minute;
        } 
        else 
            System.out.println("Please enter a valid time.");
    }

    /**
     *Switches state whenever called. If current state is set hour, will change to set minute, then to display mode. If any other state is current state, will switch to 
     * set hour state if clock state is current state.
     */
    public void AlarmSet(){
     currentState.AlarmSet();      
    }
    
    /**
     * Switches state whenever called. If current state is set hour, will change to set minute, then to display mode. If any other state is current state, will switch to 
     * set hour state if alarm state is current state.
     */
    public void ClockSet(){
        currentState.ClockSet();
    }
    
    /**
     * Depending on the state, increases hour or minute by one. Does not change hour when increased past minute boundary(Upper or lower)
     */
    public void increase(){
        currentState.increase();
    }
    
    /**
     *Depending on the state, decreases hour or minute by one. Does not change hour when increased past minute boundary(Upper or lower)
     */
    public void decrease(){
        currentState.decrease();
    }
    
    public AlarmClock getClockHourState(){
        return clockHourState;
    }
    public AlarmClock getClockMinuteState(){
        return clockMinuteState;
    }

    public AlarmClock getAlarmHourState(){
        return alarmHourState;
    }

    public AlarmClock getAlarmMinuteState(){
        return alarmMinuteState;
    }

    public AlarmClock getDisplayState(){
        return displayState;
    }
    
    public void changeMode(){
        if(this.isPM == false)
            isPM = true;
        else 
            isPM = false;
    }
    
}
