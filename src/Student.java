public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount = 0;
    private static int count = 1;
    public Student(String firstName, String lastName, int age, int yearLevel){
        id = count;
        count = count + 1;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearLevel = yearLevel;
        studentCount = studentCount + 1;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String newFN){
        firstName = newFN;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLN){
        lastName = newLN;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int newYL){
        yearLevel = newYL;
    }
    public int getStudentCount(){
        return studentCount;
    }

    public boolean equals(Student otherStudent){
        if((getFirstName().equals(otherStudent.getFirstName())) && (getLastName().equals(otherStudent.getLastName())) && (getAge() == otherStudent.getAge()) && (getYearLevel() == otherStudent.getYearLevel())){
            return true;
        }
        return false;
    }
    public String toString(){
        return("Student{id="+getId()+", firstName='"+getFirstName()+"', lastName='"+getLastName()+"', age="+getAge()+", yearLevel="+getYearLevel()+"}");
    }

}
