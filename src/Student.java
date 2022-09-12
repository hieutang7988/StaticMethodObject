public class Student {
 private  int rollno;
 private String name;
 private  static String college = "BBDIT";

 Student(int r , String n) {
     rollno = r;
     name = n;
 }

 void  display() {
     System.out.println(rollno + "\t" + name + "\t" +college);
 }
 static void change() {
     college = "CODEGYM";
 }
}


