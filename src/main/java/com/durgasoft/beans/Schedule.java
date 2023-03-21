package com.durgasoft.beans;

public class Schedule {
    private String scheduleId;
    private String demoDate;
    private String demoTime;

    public Schedule(String scheduleId, String demoDate, String demoTime) {
        this.scheduleId = scheduleId;
        this.demoDate = demoDate;
        this.demoTime = demoTime;
    }

    public void getScheduleDetails()
    {
        System.out.println("Schedule Details");
        System.out.println("---------------------");
        System.out.println("Schedule Id    :"+scheduleId);
        System.out.println("Demo Date      :"+demoDate);
        System.out.println("Demo Time      :"+demoTime);
    }
}
