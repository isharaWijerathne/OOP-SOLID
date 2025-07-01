package ProtoType;

public class Student implements IStudent{
    public String Name;
    public int Age;
    private String Id;

    public Student(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
        this.Id = this.Name + String.valueOf(Age) + String.valueOf(Math.random() * 101);
    }

    public void PrintStudentId() {
        System.out.println("Id " + this.Id);
    }

    @Override
    public Student Clone() {
        return new Student(this.Name, this.Age);
    }
}
