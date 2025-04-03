package com.example.rku_ierpac_system;

public class AttendanceModel {
    private String date;
    private String day;
    private String slot1;
    private String slot2;
    private String slot3;
    private String slot4;


    public AttendanceModel(String date, String day, String slot1, String slot2, String slot3, String slot4) {
        this.date = date;
        this.day = day;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
    }

    public String getDate() { return date; }
    public String getDay() { return day; }
    public String getSlot1() { return slot1; }
    public String getSlot2() { return slot2; }
    public String getSlot3() { return slot3; }
    public String getSlot4() { return slot4; }
}

