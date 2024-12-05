package org.pplmnglld.repositories;

import org.pplmnglld.models.Attendance;
import org.pplmnglld.models.User;

import java.util.ArrayList;
import java.util.List;

public class AttendanceRepository {
    private List<Attendance> attendancerecords;
    private long nextId = 1L;

    public Attendance save(Attendance attendance) {
        attendance = new Attendance(nextId++, attendance.getDate(), attendance.isStatus(), attendance.getStudent());
        attendancerecords.add(attendance);
        return attendance;
    }

    public List<Attendance> findByStudent(User student) {
        List<Attendance> result = new ArrayList<>();
        for (Attendance record : attendancerecords) {
            if (record.getStudent().equals(student)) {
                result.add(record);
            }
        }
        return result;
    }

//public AttendanceRepository(){
//    attendancerecords = new ArrayList<>();
//}


}