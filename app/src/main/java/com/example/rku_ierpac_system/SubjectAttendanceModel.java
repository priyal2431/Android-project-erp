package com.example.rku_ierpac_system;

public class SubjectAttendanceModel {
    private String subjectName;
    private int totalLectures;
    private int remainingLectures;
    private int presentLectures;
    private double attendancePercentage;

    public SubjectAttendanceModel(String subjectName, int totalLectures, int remainingLectures, int presentLectures, double attendancePercentage) {
        this.subjectName = subjectName;
        this.totalLectures = totalLectures;
        this.remainingLectures = remainingLectures;
        this.presentLectures = presentLectures;
        this.attendancePercentage = attendancePercentage;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getTotalLectures() {
        return totalLectures;
    }

    public int getRemainingLectures() {
        return remainingLectures;
    }

    public int getPresentLectures() {
        return presentLectures;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }
}
