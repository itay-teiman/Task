package org.example;

public class TaskMnager {
    private  Category C1;
    private  UrgentTask U1;



    private  RuglerTask R1;

     public  TaskMnager (){

     }
    public TaskMnager(Category c1, UrgentTask u1, RuglerTask r1) {
        C1 = c1;
        U1 = u1;
        R1 = r1;
    }

    public Category getC1() {
        return C1;
    }

    public void setC1(Category c1) {
        C1 = c1;
    }

    public UrgentTask getU1() {
        return U1;
    }

    public void setU1(UrgentTask u1) {
        U1 = u1;
    }

    public RuglerTask getR1() {
        return R1;
    }

    public void setR1(RuglerTask r1) {
        R1 = r1;
    }
    @Override
    public String toString() {
        return "TaskMnager{" +
                "C1=" + C1 +
                ", U1=" + U1 +
                ", R1=" + R1 +
                '}';
    }
}
