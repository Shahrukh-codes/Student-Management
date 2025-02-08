

import java.util.LinkedList;
import java.util.Scanner;

public class Studentmainclass {

       private static LinkedList<Student> student = new LinkedList<>();
       private static Scanner sc = new Scanner(System.in);

       public static  void addStudent(){
              System.out.println("Enter Student details for add: ");
              System.out.print("Enter id : ");
              int id = sc.nextInt();

              System.out.println("Enter your name : ");
              String name =sc.next();

              System.out.println("Enter age : ");
              int age = sc.nextInt();

              System.out.println("Enter your city : ");
              String city = sc.next();

              student.add(new Student(id, name, age, city));
              choose();
       }

       public static void viewStudent(){
              System.out.println();

              if(student.isEmpty()){
                     System.out.println("Student not found");
              }
              else {
                     for(int i =0;i< student.size();i++){
                            System.out.println(student.get(i));
                     }

              }
              choose();
       }

       public static void updateStudent(){
              System.out.println("\n  Update method :");
              System.out.println("Enter id : ");
              int id= sc.nextInt();
              for(int i=0; i< student.size();i++){
                     Student s= student.get(i);
                     if(s.getId()==id){
                            sc.nextLine();
                            System.out.println("Enter your name : ");
                            String name = sc.next();
                            System.out.println("Enter your age : ");
                            int age =sc.nextInt();
                            System.out.println("Enter your city : ");
                            String city = sc.next();
                            s.setName(name);
                            s.setAge(age);
                            s.setCity(city);
                            System.out.println("Student updated sucessfully..");
                            System.out.print(s.getId()+" ");
                            System.out.print(s.getAge()+" ");
                            System.out.print(s.getName()+" ");
                            System.out.print(s.getCity()+" ");

                     }
                     else {
                            System.out.println("Please enter valid id : ");
                     }
              }
              choose();
       }
       public static void searchStudent(){
              System.out.println("Search Student : ");
             // Scanner sc = new Scanner(System.in);
              System.out.print("Enter id for searching student : ");
              int id = sc.nextInt();


              for(int i =0;i< student.size();i++) {
                     Student s= student.get(i);
                     if (s.getId()==id) {
                            System.out.println(s.getId());
                            System.out.println(s.getName());
                            System.out.println(s.getAge());
                            System.out.println(s.getCity());
                     }
                     else {
                            System.out.println("Your id is not same \n Please enter valid id : ");
                     }
              }
              choose();
       }

       public static void deleteStudent(){
              System.out.println("Delete all infomation of Student : ");
//              Scanner sc = new Scanner(System.in);
              System.out.println("Enter id of student : ");
              int id = sc.nextInt();
              for(int i=0;i< student.size();i++) {
                     Student s = student.get(i);
                     if (s.getId() == id) {
                            student.remove(i);

                     }
                     else {
                            System.out.println("Your id is not same : ");
                            deleteStudent();
                            break ;

                     }
              }
              choose();
       }
public static void choose() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your choise : ");

       System.out.println("Enter 1 to view : ");
       System.out.println("enter 2 to update : ");
       System.out.println("Enter 3 to search : ");
       System.out.println("Enter 4 to delete : ");
       System.out.println("Enter 5 to add : ");
       int num = sc.nextInt();
       switch (num) {
              case 1:
                     viewStudent();
                     break;
              case 2:
                     updateStudent();
                     break;
              case 3:
                     searchStudent();
                     break;
              case 4:
                     deleteStudent();
              case 5:
                     addStudent();
                     break;
              default:
                     break;
       }
}

       public static void main(String[] args) {
              choose();
       }
}
