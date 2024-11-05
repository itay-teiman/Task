package org.example;

public class Task {
    private string    description;
    private  string displayTask;
    private  int priority;

    public Task() {

    }

    public string getDescription() {
        return description;
    }

    public void setDescription(string description) {
        this.description = description;
    }

    public string getDisplayTask() {
        return displayTask;
    }

    public void setDisplayTask(string displayTask) {
        this.displayTask = displayTask;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description=" + description +
                ", displayTask=" + displayTask +
                ", priority=" + priority +
                '}';
    }
}
