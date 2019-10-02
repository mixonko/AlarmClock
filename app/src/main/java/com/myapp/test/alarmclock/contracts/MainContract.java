package com.myapp.test.alarmclock.contracts;

import com.myapp.test.alarmclock.entity.AlarmClock;

import java.util.List;

public interface MainContract {
    interface View{
        void setInfoText(String infoText);
        void startCreateActivity();
        void startChangeActivity(int id);
        void setAdapter(List<AlarmClock> list);
        void alarmClockOn(int hour, int minute, int id);
        void alarmClockOff(int id);
        void showAlarmClockOff(String hour, String minute);
        void showAlarmClockOn(String hour, String minute);
        void showDeleteDialog(AlarmClock alarmClock, int position);
        void deleteItem(int position);
    }

    interface Presenter{
        void onCreateActivity();
        void onItemWasClicked(AlarmClock alarmClock);
        void onItemWasLongClicked(AlarmClock alarmClock, int position);
        void onSwitchWasChanged(Boolean b, AlarmClock alarmClock);
        void onCreateButtonWasClicked();
        void onDeleteWasClicked(AlarmClock alarmClock, int position);
        void onResume();

    }

}
