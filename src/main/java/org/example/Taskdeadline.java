package org.example;

public class Taskdeadline {
    private  string deadline;

    public Taskdeadline(string deadline) {
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
