import java.util.*;
/**
 * Main

 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<CollegeStudent> students = new ArrayList<CollegeStudent>();
        CollegeStudent s1 = new CollegeStudent();
        students.add(s1);
        CollegeStudent s2 = new CollegeStudent("James","Philosophy");
        students.add(s2);
        CollegeStudent s3 = new PhysicsStudent();
        students.add(s3);
        CollegeStudent s4 = new PhysicsStudent("Carlos","Astrophysics");
        students.add(s4);
        CollegeStudent s5 = new PhysicsGradStudent();
        students.add(s5);
        CollegeStudent s6 = new PhysicsGradStudent("Yake","Quantum Physics",
                                                "Dr. Ubute","Nuclear Decay");
        students.add(s6);
        CollegeStudent s7 = s6;
        students.add(s7);
        CollegeStudent s8 = new PhysicsStudent("Kim","Energy Systems");
        students.add(s8);
        PhysicsStudent s9 = new PhysicsGradStudent("Iqbal","Fluids",
                                               "Dr. Wilma Goldstein","Turbulent Flow");
        students.add(s9);
        PhysicsGradStudent s10 = new PhysicsGradStudent();
    }              
}
