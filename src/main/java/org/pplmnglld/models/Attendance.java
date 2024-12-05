package org.pplmnglld.models;

import java.time.LocalDate;

public class Attendance {
private Long id;
private LocalDate date;
private boolean status;     // true for present, false for absent
private User student;

    public Attendance(Long id, LocalDate date, boolean status, User student) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", date=" + date +
                ", status=" + status +
                ", student=" + student +
                '}';
    }
}
