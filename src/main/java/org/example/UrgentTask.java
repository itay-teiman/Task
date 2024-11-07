package org.example;

public class UrgentTask  extends Task{
    private  string deadline;

    public UrgentTask(string deadline) {
        this.deadline = deadline;
    }

    public string getDeadline() {
        return deadline;
    }

    public void setDeadline(string deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Taskdeadline{" +
                "deadline=" + deadline +
                '}';
    }
}
