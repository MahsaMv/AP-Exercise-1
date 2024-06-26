package exercise1;

// Implement or extend the human class to make a professor class...
//  4.Add the following attributes to this class with setters and getters: professorSpecialty, professorFaculty, numberOfCourse
//  5.Change the professor class so that when we call the sayMyName() method on an instance of this class, fullName of the professor plus their professorFaculty is printed.
 
public class Professor extends Human{
    private String professorFaculty;
    private String numberOfCourse;
    private String professorSpecialty;

    public Professor(String fullName){
    }

    public String getProfessorFaculty() {
        return professorFaculty;
    }
    public String getNumberOfCourse() {
        return numberOfCourse;
    }
    public String getProfessorSpecialty() {
        return professorSpecialty;
    }
    public void setProfessorFaculty(String professorFaculty) {
        this.professorFaculty = professorFaculty;
    }
    public void setNumberOfCourse(String numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }
    public void setProfessorSpecialty(String professorSpecialty) {
        this.professorSpecialty = professorSpecialty;
    }

    @Override
    public void sayMyName() {
        System.out.print(fullName + professorFaculty);
    }
}
