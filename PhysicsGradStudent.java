
/**
 * PhysicsGradStudent
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhysicsGradStudent extends PhysicsStudent
{
    private String professor;
    private String researchTopic;
    
    public PhysicsGradStudent()
    {
        super();
        this.professor = "Albert Einstein";
        this.researchTopic = "TBD";
    }
    public PhysicsGradStudent(String name, String concentration,
    String professor, String researchTopic){
        super(name,concentration);
        this.professor = professor;
        this.researchTopic = researchTopic;
    }
    public String getProfessor(){
        return professor;
    }
    public String getResearchTopic(){
        return researchTopic;
    }
    public String toString(){
        return super.toString() + "\nProfessor: " + professor + 
        "\nResearch Topic: " + researchTopic;
    }
    public boolean equals(PhysicsGradStudent other){
        return super.equals(other) && (this.professor == other.getProfessor()) && 
        (this.researchTopic == other.getResearchTopic());
    }
    public double getGravity(double mass1, double mass2, double radius){
        double G = 6.67 * Math.pow(10,-11); 
        return (G*mass1*mass2)/(Math.pow(radius,2));
    }
    public void giveAdvice(){
        System.out.println("Always define your system first!");
    }
    public String gradeEssay(){
        String[] grades = {"A","B","C","D","F"};
        return grades[(int)(Math.random()*5)];
    }
}
