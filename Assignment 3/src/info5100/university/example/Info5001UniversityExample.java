/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();
        //Creating courses
        Course cc1 = coursecatalog.newCourse("application engineering", "info 5100", 4);
        Course cc2 = coursecatalog.newCourse("lab for appication engineering", "info 5101", 3);
        Course cc3 = coursecatalog.newCourse("Business analytics", "damg 6310", 4);
        Course cc4 = coursecatalog.newCourse("encp", "info 6030", 4);
        Course cc5 = coursecatalog.newCourse("software development", "info 5002", 4);
        Course cc6 = coursecatalog.newCourse("soft computing", "cyse 5102", 2);
        Course cc7 = coursecatalog.newCourse("Digital Prod Management", "info 5392", 4);
        Course cc8 = coursecatalog.newCourse("Mobile development", "info 5305", 3);
        
        Degree d = new Degree("Master in Science");
        d.addCoreCourse(cc1);
        d.addCoreCourse(cc2);
        d.addCoreCourse(cc3);
        d.addElectiveCourse(cc4);
        d.addElectiveCourse(cc5);
        d.addElectiveCourse(cc6);
        d.addElectiveCourse(cc7);
        d.addElectiveCourse(cc8);
        //Creating course/class schedules
        CourseSchedule cs = department.newCourseSchedule("Spring 2024");

        CourseOffer co1 = cs.newCourseOffer("info 5100");
        if (co1==null)return;
        co1.generatSeats(5);
        
        CourseOffer co2 = cs.newCourseOffer("info 5101");
        if (co2==null)return;
        co2.generatSeats(5);
        
        CourseOffer co3 = cs.newCourseOffer("damg 6210");
        if (co3==null)return;
        co3.generatSeats(5);
        
        CourseOffer co4 = cs.newCourseOffer("info 6000");
        if (co4==null)return;
        co4.generatSeats(5);
        
        CourseOffer co5 = cs.newCourseOffer("info 5102");
        if (co5==null)return;
        co5.generatSeats(5);
        
        CourseOffer co6 = cs.newCourseOffer("info 5103");
        if (co6==null)return;
        co6.generatSeats(5);
        HashMap<CourseOffer,ArrayList<FacultyAssignment>> fac_cou_map = new HashMap<>();
        
        //Assigning professor to courses
        PersonDirectory pd = department.getPersonDirectory();
        Person p1 = pd.newPerson("f1");
        FacultyDirectory fd1 = department.getFacultyDirectory();
        FacultyProfile fp1 = fd1.newFacultyProfile(p1);
        FacultyAssignment ff=fp1.AssignAsTeacher(co1);
        fac_cou_map.put(co1,ff.getFacultyProfile().facultyassignments);
        
        Person p2 = pd.newPerson("f2");
        FacultyDirectory fd2 = department.getFacultyDirectory();
        FacultyProfile fp2 = fd2.newFacultyProfile(p2);
        FacultyAssignment ff2=fp2.AssignAsTeacher(co2);
        fac_cou_map.put(co2,ff2.getFacultyProfile().facultyassignments);
        
        Person p3 = pd.newPerson("f3");
        FacultyDirectory fd3 = department.getFacultyDirectory();
        FacultyProfile fp3 = fd3.newFacultyProfile(p3);
        FacultyAssignment ff3=fp3.AssignAsTeacher(co3);
        fac_cou_map.put(co3,ff3.getFacultyProfile().facultyassignments);
        
        Person p4 = pd.newPerson("f4");
        FacultyDirectory fd4 = department.getFacultyDirectory();
        FacultyProfile fp4 = fd4.newFacultyProfile(p4);
        FacultyAssignment ff4=fp4.AssignAsTeacher(co4);
        fac_cou_map.put(co4,ff4.getFacultyProfile().facultyassignments);
        
        Person p5 = pd.newPerson("f5");
        FacultyDirectory fd5 = department.getFacultyDirectory();
        FacultyProfile fp5 = fd5.newFacultyProfile(p5);
        FacultyAssignment ff5=fp5.AssignAsTeacher(co5);
        fac_cou_map.put(co5,ff5.getFacultyProfile().facultyassignments);
        
        Person p6 = pd.newPerson("f6");
        FacultyDirectory fd6 = department.getFacultyDirectory();
        FacultyProfile fp6 = fd6.newFacultyProfile(p6);
        FacultyAssignment ff6=fp6.AssignAsTeacher(co6);
        fac_cou_map.put(co6,ff6.getFacultyProfile().facultyassignments);

        
        // Create students
        Person s1 = pd.newPerson("s1");
        StudentDirectory sd = department. getStudentDirectory () ;

        StudentProfile sp1 = sd.newStudentProfile (s1) ;
        CourseLoad cl1 = sp1. newCourseLoad (  "Spring 2024") ;
         cl1.newSeatAssignment(co1); 
        
        Person s2 = pd.newPerson("s2");
        StudentProfile sp2 = sd.newStudentProfile(s2);
        CourseLoad cl2 = sp2.newCourseLoad("Spring 2024");
        cl2.newSeatAssignment(co5);

        Person s3 = pd.newPerson("s3");
        StudentProfile sp3 = sd.newStudentProfile(s3);
        CourseLoad cl3 = sp3.newCourseLoad("Spring 2024");
        cl3.newSeatAssignment(co2);

        Person s4 = pd.newPerson("s4");
        StudentProfile sp4 = sd.newStudentProfile(s4);
        CourseLoad cl4 = sp4.newCourseLoad("Spring 2024");
        cl4.newSeatAssignment(co3);

        Person s5 = pd.newPerson("s5");
        StudentProfile sp5 = sd.newStudentProfile(s5);
        CourseLoad cl5 = sp5.newCourseLoad("Spring 2024");
        cl5.newSeatAssignment(co4);

        Person s6 = pd.newPerson("s6");
        StudentProfile sp6 = sd.newStudentProfile(s6);
        CourseLoad cl6 = sp6.newCourseLoad("Spring 2024");
        cl6.newSeatAssignment(co5);

        Person s7 = pd.newPerson("s7");
        StudentProfile sp7 = sd.newStudentProfile(s7);
        CourseLoad cl7 = sp7.newCourseLoad("Spring 2024");
        cl7.newSeatAssignment(co6);

        Person s8 = pd.newPerson("s8");
        StudentProfile sp8 = sd.newStudentProfile(s8);
        CourseLoad cl8 = sp8.newCourseLoad("Spring 2024");
        cl8.newSeatAssignment(co6);

        Person s9 = pd.newPerson("s9");
        StudentProfile sp9 = sd.newStudentProfile(s9);
        CourseLoad cl9 = sp9.newCourseLoad("Spring 2024");
        cl9.newSeatAssignment(co5);

        Person s10 = pd.newPerson("s10");
        StudentProfile sp10 = sd.newStudentProfile(s10);
        CourseLoad cl10 = sp10.newCourseLoad("Spring 2024");
        
        cl10.newSeatAssignment(co1);
        cl1.newSeatAssignment(co2);
        cl2.newSeatAssignment(co3);
        cl3.newSeatAssignment(co4);
        cl4.newSeatAssignment(co5);
        cl5.newSeatAssignment(co6);
        cl6.newSeatAssignment(co4);
        cl7.newSeatAssignment(co2);
        cl8.newSeatAssignment(co1);
        cl9.newSeatAssignment(co3);
        cl10.newSeatAssignment(co4);
        
        System.out.println("Courses are:");
        for (int i=0;i<coursecatalog.getCourseList().size();i++){
            Course c = coursecatalog.getCourseList().get(i);
            System.out.println("* "+c.getCOurseName()+" ("+c.getCOurseNumber()+"), credits="+c.getCredits()+", price/credit="+c.getCoursePrice());
        }
        System.out.println("\n");
        for (int i=0;i<sd.studentlist.size();i++){
            System.out.println("Student: "+sd.studentlist.get(i).person.getPersonId()+" and his course registration is: ");
            double totalCredits = 0, fees=0, totalcreditPoints=0;
            for (int j=0;j<sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().size();j++){ 
                CourseOffer co = sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getCourseOffer();
                System.out.println("Course: "+co.getSubjectCourse().getCOurseName()+" ("+co.getCourseNumber()+")");
                System.out.println("- Faculty: "+fac_cou_map.get(co).get(0).getFacultyProfile().person.getPersonId());
                
                double grade = Math.round((3.0 + Math.random()) * 10.0) / 10.0;
                sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).grade=(float) grade;
                System.out.println("- Grade: "+grade);
                System.out.println("- Credits: "+sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getSeat().getCourseOffer().getCreditHours());
                int credits=sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getSeat().getCourseOffer().getCreditHours();;
                int price = sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getSeat().getCourseOffer().getSubjectCourse().getCoursePrice();
                fees=fees+credits*price;
                totalCredits =totalCredits+ credits*grade;
                totalcreditPoints = totalcreditPoints+credits;
            }
            System.out.println("GPA: "+Math.round((totalCredits/totalcreditPoints) * 100.0) / 100.0);
            System.out.println("Total tuition fees: "+fees);
            System.out.println("\n");
        }
            int total = department.calculateRevenuesBySemester("Spring 2024");
            System.out.println("Total Revenue for the Department in Spring 2024 is " + total+"    ");
    

    }

}
