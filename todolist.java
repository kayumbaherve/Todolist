package Todolist;

import java.util.*;  

public class todolist{

  

public static void main(String args[]){  

Scanner sc = new Scanner (System.in);

System.out.println("To-do list");

boolean flag = true;

String task = "";

  

List<String> todo = new ArrayList<String>();

do{

System.out.println("1.Add a task\n" +

"2.View all tasks\n" +

"3.Delete all tasks\n" +

"4.Quit\n");


int choice = sc.nextInt();

switch(choice){

case 1:


System.out.println("Enter task: ");

task = sc.next();
 

todo.add(task);

break;

case 2:

System.out.println(" Here are tasks in to-do list are:");
 

for(String t:todo)  

System.out.println(t);

break;

  

case 3:

System.out.println("Enter task to be deleted:");

task = sc.next();

//Removing the particular element in list

todo.remove(task);

break;



case 4:

flag = false;

System.out.println("Bye!");

}

}while(flag);

  

}  

}  