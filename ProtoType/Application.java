package ProtoType;

public class Application 
{
    
    public static void main(String[] args) {
        Student NewStudent = new Student("Ishara", 26);
        Student CopyStudent = NewStudent.Clone();

        NewStudent.PrintStudentId();
        CopyStudent.PrintStudentId();
    }

}
