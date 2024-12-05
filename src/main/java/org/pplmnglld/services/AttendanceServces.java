package org.pplmnglld.services;

import org.pplmnglld.models.Attendance;
import org.pplmnglld.models.User;
import org.pplmnglld.repositories.AttendanceRepository;

import java.time.LocalDate;
import java.util.List;

public class AttendanceServces {
private AttendanceRepository attendanceRepository = new AttendanceRepository();
    private Attendance attendance   ;

    public  void MarkAttendance(User student, boolean status, LocalDate date){
       Attendance  attendance = new Attendance(null,date,status,student);
    attendanceRepository.save(attendance);
}

public  void  markAttendence(User student, LocalDate date, boolean status){
    attendanceRepository.save(new Attendance(null,date,status,student));
    attendanceRepository.save(attendance);
}

public List <Attendance> getAttendanceForStudent(User student){
    return attendanceRepository.findByStudent(student);
}
}
