public class Student extends Person{

    private int grade;
    private Section[] sections = new Section[10];
    private int sectionCount = 0;

    public Student(int grade, String name, int id){
        super(name,id);
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        this.sectionCount++;
    }

    public Section[] getSections(){
        return this.sections;
    }

}

