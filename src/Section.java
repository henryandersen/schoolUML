public class Section {

    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    public Section(String name){
        this.name = name;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudent(Student s){
        this.students[currentSize] = s;
        this.currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void toString4(){
        String studentList = "";
        for(int i =0; i < currentSize; i++){
            studentList += students[i].getName();
            if(i < currentSize-1){
                studentList += ", ";
            }
        }
        System.out.println("This " + this.name + " class is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + studentList);
    }

}
