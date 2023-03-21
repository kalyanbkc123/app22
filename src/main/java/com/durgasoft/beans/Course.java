package com.durgasoft.beans;

public class Course {
    private String cid;
    private String cname;
    private int cfee;
    private Schedule schedule;

    public Course(String cid, String cname, int cfee, Schedule schedule) {
        this.cid = cid;
        this.cname = cname;
        this.cfee = cfee;
        this.schedule = schedule;
    }

    public void getCourseDetails()
    {
        System.out.println("Course Details");
        System.out.println("--------------------");
        System.out.println("Course Id    :"+cid);
        System.out.println("Course Name  :"+cname);
        System.out.println("Course Fee   :"+cfee);
        System.out.println();
        schedule.getScheduleDetails();
    }
}
