/*
 Create three classes as per the following specifications:
 Student: Data members are Register Number, Name, Course and Semester.
 Exam (derived from class Student): Data members are the marks scored in three subjects.
 Result (derived from class Exam): Data members are Total Marks and Grade.
Input the relevant data of one student and process the result.
 */

package Student_Exam_Result;
import java.util.*;
class Student       //Student: Data members are Register Number, Name, Course and Semester
{
    Scanner s=new Scanner(System.in);
    int rgno;
    String name;
    String course;
    int sem;
    void stud_get_detail()
    {
        System.out.println("Enter Rg number:");
        rgno=s.nextInt();
        System.out.println("Enter Name:");
        name=s.next();
        System.out.println("Enter Course:");
        course=s.next();
        System.out.println("Enter Semester:");
        sem=s.nextInt();
    }
}
class Exam  extends Student//Exam (derived from class Student): Data members are the marks scored in three subjects.
{
    Scanner s=new Scanner(System.in);
    int m1,m2,m3;
    void get_marks()
    {
        System.out.println("Enter marks in three subject:");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
    }
}
class Result extends Exam
{
    String grade;
    int total;
    float avg;
    void result_calc()
    {
        total=m1+m2+m3;
        avg=total/3;
        if(avg>90)
        {
            grade="A+";
        }
        else if(avg>80)
        {
            grade="A";
        }
        else if(avg>70)
        {
            grade="B";
        }
        else if(avg>60)
        {
            grade="C";
        }
        else if(avg>50)
        {
            grade="E";
        }
        else
            grade="F";
    }
    void dis_res()
    {
        System.out.println("*****Student result*****");
        System.out.println("Rgno        :"+rgno);
        System.out.println("Name        :"+name);
        System.out.println("Course      :"+course);
        System.out.println("Semester    :"+sem);
        System.out.println("Marks in 3 subjects: "+m1+" "+m2+" "+m3);
        result_calc();
        System.out.println("Total       :"+total+"\nGrade       :"+grade);
    }

}
public class Student_Exam_Result {

    public static void main(String[] args) {
        System.out.println("Enter Student details");
        Result r=new Result();
        r.stud_get_detail();
        r.get_marks();
        r.dis_res();
    }
}
