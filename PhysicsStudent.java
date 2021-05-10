import java.util.*;
/**
 * PhysicsStudent
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhysicsStudent extends CollegeStudent
{
    private String concentration;
    private ArrayList<String> PhysicsClasses = new ArrayList<String>();
    public PhysicsStudent()
    {
        super("John Doe", "Physics");
        concentration = "Not declared"; 
    }
    public PhysicsStudent(String name, String concentration)
    {
        super(name, "Physics");
        this.concentration = concentration;
    }
    public String getConcentration(){
        return concentration;
    }
    public String toString(){
        return super.toString() + "\nConcentration: " + concentration;
    }
    public boolean equals(PhysicsStudent other){
        return super.equals(other) && (this.concentration == other.getConcentration());
    }
    public void addClass(String className){
        PhysicsClasses.add(className);
    }  
    public void removeClass(String className){
        PhysicsClasses.remove(className);
    }
    public double calculateAvgVelocity(double distance, double time){
        return distance/time;
    }
    public double calculateGravity(double mass, double weight){
        return weight/mass;
    }
}
