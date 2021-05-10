import java.util.*;
/**
 * CollegeStudent
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeStudent
{
    // instance variables - replace the example below with your own
    private static int ID = 1;
    private String name;
    private int id;
    private String major;
    private ArrayList<String> classes = new ArrayList<String>(); 
    
    public CollegeStudent()
    {
        name = "John Doe";
        id = ID++;
        major = "Not declared";
    }
    public CollegeStudent(String name, String major)
    {
        this.name = name;
        id = ID++;
        this.major = major;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public String toString(){
        return "Name: "+ name + "\nID: " + id + "\nMajor: " + major;
    }
    public boolean equals(CollegeStudent other){
        return this.id == other.getID();
    }
    public void addClass(String className){
        classes.add(className);
    }
    public void removeClass(String className){
        classes.remove(className);
    }
}
