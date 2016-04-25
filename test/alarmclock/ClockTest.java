/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xavier
 */
public class ClockTest {
    //private static Clock clock;
    @BeforeClass
    public static void setUpClass() {
        //clock = new Clock();
    }

    /**
     * Test of getHour method, of class Clock.
     */
    @Test
    public void testGetSetTime() {
        Clock clock = new Clock();
        clock.setTime(11, 33);
        assertEquals(clock.getClockHour(), 11);
        assertEquals(clock.getClockMinute(), 33);
    }
    @Test
    public void testDisplayTime(){
        Clock clock = new Clock();
        System.out.println(clock.displayTime());
        System.out.println(clock.displayAlarm());
    }
    @Test
    public void testClockSetIncreaseHour(){
        Clock clock = new Clock();
        clock.setTime(3, 44);
        clock.ClockSet();
        clock.increase();
        //clock time should currently be 4:44
        assertEquals(4,clock.getClockHour());
        assertEquals(clock.getClockMinute(), 44);
    }
    @Test
    public void testClockSetIncreaseMinute(){
        Clock clock = new Clock();
        clock.setTime(6, 30);
        clock.ClockSet();
        clock.ClockSet();
        clock.increase();
        assertEquals(31, clock.getClockMinute());
    }
    @Test
    public void testAlarmSetIncrease(){
        Clock clock = new Clock();
        clock.AlarmSet();
        clock.increase();
        assertEquals(11, clock.getAlarmHour());
    }
    @Test
    public void testAlarmSetIncreaseMinute(){
        Clock clock = new Clock();
        clock.AlarmSet();
        clock.AlarmSet();
        clock.increase();
        assertEquals(01, clock.getAlarmMinute());
    }
    @Test
    public void testClockDecreaseHour(){
        Clock clock = new Clock();
        clock.ClockSet();
        clock.decrease();
        assertEquals(10, clock.getClockHour());
    }
    @Test
    public void testClockDecreaseMinute(){
       Clock clock = new Clock();
        clock.ClockSet();
        clock.ClockSet();
        clock.decrease();
        assertEquals(29, clock.getClockMinute()); 
    }
    @Test
    public void testAlarmDecreaseHour(){
        Clock clock = new Clock();
        clock.AlarmSet();
        clock.decrease();
        assertEquals(9, clock.getAlarmHour());
    }
    @Test
    public void testAlarmDecreaseMinute(){
        Clock clock = new Clock();
        clock.setAlarmTime(12, 45);
        clock.AlarmSet();
        clock.AlarmSet();
        clock.decrease();
        assertEquals(44, clock.getAlarmMinute());
    }
    @Test 
    public void testClockLowerHourBoundary(){
        Clock clock = new Clock();
        clock.setTime(1, 30);
        clock.ClockSet();
        clock.decrease();
        assertEquals(12, clock.getClockHour());
    }
    @Test 
    public void testClockLowerMinuteBoundary(){
        Clock clock = new Clock();
        clock.setTime(12, 0);
        clock.ClockSet();
        clock.ClockSet();
        clock.decrease();
        assertEquals(59, clock.getClockMinute());
        
    }
    @Test
    public void testClockUpperHourBoundary(){
        Clock clock = new Clock();
        clock.setTime(12,30);
        clock.ClockSet();
        clock.increase();
        assertEquals(1, clock.getClockHour());
    }
    @Test
    public void testClockUpperMinuteBoundary(){
        Clock clock = new Clock();
        clock.setTime(12,59);
        clock.ClockSet();
        clock.ClockSet();
        clock.increase();
        assertEquals(0, clock.getClockMinute());
    }
    @Test 
    public void testAlarmLowerHourBoundary(){
        Clock clock = new Clock();
        clock.setAlarmTime(1, 30);
        clock.AlarmSet();
        clock.decrease();
        assertEquals(12, clock.getAlarmHour());
    }
    @Test 
    public void testAlarmLowerMinuteBoundary(){
        Clock clock = new Clock();
        clock.setAlarmTime(12, 0);
        clock.AlarmSet();
        clock.AlarmSet();
        clock.decrease();
        assertEquals(59, clock.getAlarmMinute());
        
    }
    @Test
    public void testAlarmUpperHourBoundary(){
        Clock clock = new Clock();
        clock.setAlarmTime(12,30);
        clock.AlarmSet();
        clock.increase();
        assertEquals(1, clock.getAlarmHour());
    }
    @Test
    public void testAlarmUpperMinuteBoundary(){
        Clock clock = new Clock();
        clock.setAlarmTime(12,59);
        clock.AlarmSet();
        clock.AlarmSet();
        clock.increase();
        assertEquals(0, clock.getAlarmMinute());
    }
}
