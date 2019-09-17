package com.myapp.test.alarmclock.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity( tableName = "alarm_clock" )
public class AlarmClock {

    public AlarmClock(String hour, String minute, Boolean alarmClockOn) {
        this.hour = hour;
        this.minute = minute;
        this.alarmClockOn = alarmClockOn;
    }

//    public AlarmClock(String hour, String minute, Boolean monday, Boolean tuesday,
//                      Boolean wednesday, Boolean thursday, Boolean friday, Boolean saturday,
//                      Boolean sunday, Boolean mySwitch) {
//        this.hour = hour;
//        this.minute = minute;
//        this.monday = monday;
//        this.tuesday = tuesday;
//        this.wednesday = wednesday;
//        this.thursday = thursday;
//        this.friday = friday;
//        this.saturday = saturday;
//        this.sunday = sunday;
//        this.mySwitch = mySwitch;
//    }

    @PrimaryKey( autoGenerate = true )
    private int id;
    @ColumnInfo( name = "hour" )
    private String hour;
    @ColumnInfo( name = "minute" )
    private String minute;
    @ColumnInfo( name = "alarm_clock_on" )
    private Boolean alarmClockOn;


//    @ColumnInfo( name = "monday" )
//    private Boolean monday;
//    @ColumnInfo( name = "tuesday" )
//    private Boolean tuesday;
//    @ColumnInfo( name = "wednesday" )
//    private Boolean wednesday;
//    @ColumnInfo( name = "thursday" )
//    private Boolean thursday;
//    @ColumnInfo( name = "friday" )
//    private Boolean friday;
//    @ColumnInfo( name = "saturday" )
//    private Boolean saturday;
//    @ColumnInfo( name = "sunday" )
//    private Boolean sunday;
//    @ColumnInfo( name = "switch" )
//    private Boolean mySwitch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public Boolean getAlarmClockOn() {
        return alarmClockOn;
    }

    public void setAlarmClockOn(Boolean alarmClockOn) {
        this.alarmClockOn = alarmClockOn;
    }

    //    public Boolean getMonday() {
//        return monday;
//    }
//
//    public void setMonday(Boolean monday) {
//        this.monday = monday;
//    }
//
//    public Boolean getTuesday() {
//        return tuesday;
//    }
//
//    public void setTuesday(Boolean tuesday) {
//        this.tuesday = tuesday;
//    }
//
//    public Boolean getWednesday() {
//        return wednesday;
//    }
//
//    public void setWednesday(Boolean wednesday) {
//        this.wednesday = wednesday;
//    }
//
//    public Boolean getThursday() {
//        return thursday;
//    }
//
//    public void setThursday(Boolean thursday) {
//        this.thursday = thursday;
//    }
//
//    public Boolean getFriday() {
//        return friday;
//    }
//
//    public void setFriday(Boolean friday) {
//        this.friday = friday;
//    }
//
//    public Boolean getSaturday() {
//        return saturday;
//    }
//
//    public void setSaturday(Boolean saturday) {
//        this.saturday = saturday;
//    }
//
//    public Boolean getSunday() {
//        return sunday;
//    }
//
//    public void setSunday(Boolean sunday) {
//        this.sunday = sunday;
//    }
//
//    public Boolean getMySwitch() {
//        return mySwitch;
//    }
//
//    public void setMySwitch(Boolean mySwitch) {
//        this.mySwitch = mySwitch;
//    }
}
