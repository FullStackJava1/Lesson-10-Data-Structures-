import Tasks.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean _Quit = false;
        int menu=0;
        String description;
        int priorty;
        boolean staus;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello world!");
        /* Task task1=new Task("cooking",1,true);
        Task task2=new Task("washing",1,true);
        Task task3=new Task("cleaning",1,false);
        Task task4=new Task("shopping",1,true);
        task1.setCompleted(false);
        //System.out.println(task1.toString());
        ArrayList <Task>taskList=new ArrayList();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        for (Task el:taskList) {
            System.out.println(el.getDes());
        }
        taskList.remove(task2);
        for (Task el:taskList) {
            System.out.println(el.getDes());
        }
        */
        ArrayList<Task>taskLists=new ArrayList<>();
        /*
        * ___Menu__
        * 1 add tasks,
        * 2 remove tasks,
        * 3 view the task list,
        * 4 mark tasks as completed,
        * 5 quit the program
         */
    while (menu!=5){
        System.out.println( " choose the option you want \n"+
                "        - 1- add tasks, \n" +
                "        - 2- remove tasks,\n" +
                "        - 3- view the task list,\n" +
                "        - 4- mark tasks as completed,\n" +
                "        - 5- quit the program ");
        menu=scanner.nextInt();
        switch (menu){
            case 1:
                System.out.println("Add tasks");//add new Tasks
                System.out.println("Task description :");
                description=scanner.next();
                System.out.println("Task priorty is :");
                priorty=scanner.nextInt();
                System.out.println("Task status  choose True/False:");
                //staus=scanner.nextBoolean();
                Task newTask =new Task(description,priorty,false);
                taskLists.add(newTask);
                Collections.sort(taskLists);
                break;
            case 2:
                System.out.println("choose Task to remove"); //use collections
                System.out.println("what is the Task you want to remove..?");
                String taskRemove=scanner.next();
               Iterator<Task> it = taskLists.iterator();
                while(it.hasNext()) {
                    //String itt=it.next().getDes();
                    if(it.next().getDes().equals(taskRemove)) {
                        it.remove();
                    }
                }
                break;
            case 3:
                System.out.println(taskLists.toString());
                break;
            case 4:
                String taskCompleted=scanner.next();
                for (Task el:taskLists) {
                 if(el.getDes().equals(taskCompleted))
                     el.setCompleted(true);
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");

        }

    }
        System.out.println("List of Tasks");
        System.out.println(taskLists.toString());
    System.out.println("_ The program is Done _");
    }
}