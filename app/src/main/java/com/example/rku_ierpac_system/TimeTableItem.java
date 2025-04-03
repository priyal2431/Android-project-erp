package com.example.rku_ierpac_system;

public class TimeTableItem {
    public static final int TYPE_CLASS = 0;
    public static final int TYPE_BREAK = 1;

    private final int type;
    private final String Time;
    private final String faculty;
    private final String subject;
    private final String classRoom;

    // Constructor for class sessions
    public TimeTableItem(int type, String Time, String faculty, String subject, String classRoom) {
        this.type = type;
        this.Time = Time;
        this.faculty = faculty;
        this.subject = subject;
        this.classRoom = classRoom;
    }

    // Constructor for break time
    public TimeTableItem(int type, String Time) {
        this.type = type;
        this.Time = Time;
        this.faculty = null;
        this.subject = null;
        this.classRoom = null;
    }

    public String getStartTime() { return Time; }
    public String getFaculty() { return faculty; }
    public String getSubject() { return subject; }
    public String getClassroom() { return classRoom; }
    public int getType() { return type; }
}
