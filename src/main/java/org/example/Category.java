package org.example;

import java.util.ArrayList;

public class Category  extends  TaskMnager{
    private  string Name;
    private ArrayList<Task> Task1=new ArrayList<Task>();

    public Category(string name, ArrayList<Task> task1) {
        Name = name;
        Task1 = task1;
    }

    public string getName() {
        return Name;
    }

    public void setName(string name) {
        Name = name;
    }

    public ArrayList<Task> getTask1() {
        return Task1;
    }

    public void setTask1(ArrayList<Task> task1) {
        Task1 = task1;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Name=" + Name +
                ", Task1=" + Task1 +
                '}';
    }
    // להוסיף מטלה לרשימה

    public void addTask (Task task) {
        this.Task1.add(task);
    }
    // להסיר משימה מהרשימה
    public void removeTask(String A){
        this.Task1.remove(A);
    }
// להציג את כל הרשימה
    public  void DisplayAllTask(){

        for (int i=0;i<Task1.toArray().length;i++){
            System.out.println(Task1.get(i));
        }

    }

}
