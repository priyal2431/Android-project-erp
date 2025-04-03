package com.example.rku_ierpac_system;

public class MonthAttendance {
    private final String date;
    private final String slot1;
    private final String slot2;
    private final String slot3;
    private final String slot4;

    public MonthAttendance(String date, String slot1, String slot2, String slot3, String slot4) {
        this.date = date;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
    }

    public String getDate() {
        return date;
    }

    public String getSlot1() {
        return slot1;
    }

    public String getSlot2() {
        return slot2;
    }

    public String getSlot3() {
        return slot3;
    }

    public String getSlot4() {
        return slot4;
    }
}
