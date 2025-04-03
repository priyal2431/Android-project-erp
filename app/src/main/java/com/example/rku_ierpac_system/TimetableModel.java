package com.example.rku_ierpac_system;

public class TimetableModel {
    private String time, subject, faculty, classroom;

    public TimetableModel(String time, String subject, String faculty, String classroom) {
        this.time = time;
        this.subject = subject;
        this.faculty = faculty;
        this.classroom = classroom;
    }

    public String getTime() { return time; }
    public String getSubject() { return subject; }
    public String getFaculty() { return faculty; }
    public String getClassroom() { return classroom; }
}
