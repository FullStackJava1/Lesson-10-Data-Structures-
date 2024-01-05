package Tasks;

import java.util.Collections;

public class Task implements Comparable {
    private String des;
    private boolean completed;
    private int priority;
    public Task(String des,int priority,boolean completd){
        this.des=des;
        this.priority=priority;
        this.completed=completd;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String toString(){
        String staus;
        if(completed==true){
            staus="Completed";
        }
        else {
            staus=" Not Completed ";
        }
        return "The task is: "+des +
                " priorty is :"+priority+"\t"+staus+ "\n";
    }

    @Override
    public int compareTo(Object other) { //public int compareTo(Task otherTask)
        Task otherT= (Task)other; //casting to task object
        return Integer.valueOf(getPriority())
                .compareTo((Integer.valueOf(otherT.getPriority())));
        /*   OR
        public int compareTo(Task otherTask) {
             // Compare tasks based on their priorities
       return Integer.compare(this.priority, otherTask.priority);
        }

        * */
    }
}
