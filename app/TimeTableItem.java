package com.example.rku_ierpac_system;

public class TimeTableItem {
    public static final int TYPE_CLASS = 1;
    public static final int TYPE_BREAK = 2;

    private int type;
    private String startTime;
    private String endTime;
    private String faculty;
    private String subject;
    private String classroom;

    // Constructor for a class period
    public TimeTableItem(int type, String startTime, String endTime, String faculty, String subject, String classroom) {
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.faculty = faculty;
        this.subject = subject;
        this.classroom = classroom;
    }

    // Constructor for a break (no faculty, subject, or classroom)
    public TimeTableItem(int type, String startTime, String endTime) {
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.faculty = null;
        this.subject = null;
        this.classroom = null;
    }

    // Getters
    public int getType() {
        return type;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassroom() {
        return classroom;
    }
}