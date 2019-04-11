public class Runner {
    public static void main(String[] args){
        School berkeleyHigh= new School("Berkeley High");

        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section computerScience = new Section("Computer Science");

        Teacher albinson = new Teacher("Computer Science", "Albinson", 1);
        Teacher baird = new Teacher("Math", "Baird", 2);
        Teacher pleskac = new Teacher("Biology", "Pleskac", 3);

        Student henry = new Student(12, "Henry", 4);
        Student royce = new Student(12, "Royce", 5);
        Student phil = new Student(12, "Phil", 6);
        Student jake = new Student(12, "Jake", 7);
        Student dylan = new Student(12, "Dylan", 8);
        Student noe = new Student(12, "Noe", 9);

        math.setTeacher(baird);
        math.addStudent(henry);
        math.addStudent(royce);
        math.addStudent(phil);
        math.toString4();

    }


}
