import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    public ClassSection(){

    }

    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;

        students = new ArrayList<Student>();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        for(Student s: students){
            if(s.getId() == student.getId()){
                break;
            }
        }

        if(yearLevel == student.getYearLevel() && !students.contains(student))
        {
            this.students.add(student);
            capacity ++;
        }

    }

    public void removeStudent(Student student){
        Student remove = new Student();
        for(Student s: students){
            if(s.getId() == student.getId()){
                remove = s;
//                students.remove(s);
            }
        }

        students.remove(remove);
    }

    public boolean isStudentEnrolled(Student student){
        for(Student s: students){
            if(s.equals(student)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
