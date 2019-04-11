public class Teacher extends Person{

    private Section[] sections = new Section[10];
    private int sectionCount = 0;
    private String subject;

    public Teacher(String subject, String name, int id){
        super(name,id);
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String s){
        this.subject = s;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        this.sectionCount++;
    }

    public Section[] getSections(){
        return this.sections;
    }
}
