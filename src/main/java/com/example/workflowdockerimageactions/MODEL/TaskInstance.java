package com.example.workflowdockerimageactions.MODEL;

import com.example.workflowdockerimageactions.DATA.Task;

public class TaskInstance {

    private Task task;
    private double timeInHours;

    public TaskInstance(Task task, double timeInHours){
        this.task = task;
        this.timeInHours = timeInHours;
    }

    public void setTaskOfTheDay(Task taskOfTheDay) {
        this.task = task;
    }

    public Task getTaskOfTheDay() {
        return task;
    }

    public double getTimeInHours() {
        return timeInHours;
    }

    public void setTimeInHours(double timeInHours) {
        this.timeInHours = timeInHours;
    }
}
