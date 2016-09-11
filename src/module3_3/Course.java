package module3_3;

import java.util.Date;

/**
 * Created by Vlad on 01.09.2016.
 */
    class Course {
    private Date startDate;
    private String name;
    private int hourseDuration;
    private String teacherName;

        Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

         Course(String name, int hourseDuration, String teacherName) {
        this.name = name;
        this.hourseDuration = hourseDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourseDuration() {
        return hourseDuration;
    }

    public void setHourseDuration(int hourseDuration) {
        this.hourseDuration = hourseDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
