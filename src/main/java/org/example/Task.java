package org.example;

public class Task {
    private string    description;
    private  int priority;

    public Task() {

    }

    public string getDescription() {
        return description;
    }

    public void setDescription(string description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public string displayTask(){
        return  this.description;
    }
    public  int displayTask1(){
        return  this.priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description=" + description +
                ", priority=" + priority +
                '}';
    }
}
