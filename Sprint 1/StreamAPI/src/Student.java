import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private int rollNo;
    private String grade;
    private int totalmarks;

    public Student(int studentId,String firstName,String lastName,int rollNo,String grade,int totalmarks) {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.rollNo=rollNo;
        this.grade=grade;
        this.totalmarks=totalmarks;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getTotalmarks() {
        return totalmarks;
    }
    public void setTotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }

    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(
                new Student(1, "Akshay", "Singh", 1, "V",900),
                new Student(2, "Aman", "Pal", 2, "V",700),
                new Student(3, "Bharat", "P", 3, "V",750),
                new Student(4, "Piyush", "Chandra", 4, "V",990),
                new Student(5, "Atul", "Kumar", 5, "V",1000));

        //Tìm tất cả sinh viên từ bảng trên với tên bắt đầu bằng chữ 'A'
        List<Student> filteredList= studentList.stream()
                .filter((Student s)->s.firstName.startsWith("A"))
                .collect(Collectors.toList());

        //Đếm tổng số sinh viên trong bảng
        long totalstudent= studentList.stream().count();

        //Đếm tổng số sinh viên có tên bắt đầu bằng chữ 'A'
        long totalStudent= studentList.stream()
                .filter((Student s)->s.firstName.startsWith("A"))
                .count();

        //Tìm 10 sinh viên đầu tiên trong bảng có tên bắt đầu bằng chữ 'A'
        List<Student> limitList= studentList.stream()
                .filter((Student s)->s.firstName.startsWith("A"))
                .limit(10)
                .collect(Collectors.toList());

        //Tìm sinh viên có tổng điểm thấp nhất
        Comparator<Student> mincomparator = Comparator.comparing(Student::getTotalmarks);
        Student minMarks = studentList.stream()
                .min(mincomparator)
                .get();

        //Tìm sinh viên có tổng điểm cao nhất
        Comparator<Student> maxcomparator = Comparator.comparing(Student::getTotalmarks);
        Student maxMarks = studentList.stream()
                .max(maxcomparator)
                .get();

        //Sắp xếp sinh viên theo tổng điểm từ cao đến thấp
        List<Student> sortedList = studentList.stream()
                .sorted(Comparator.comparingInt(Student::getTotalmarks).reversed())
                .collect(Collectors.toList());

        //Tìm sinh viên đầu tiên trong bảng có tên bắt đầu bằng chữ 'A'
        Optional<Student> firstStudent = studentList.stream()
                .filter((Student s)->s.firstName.startsWith("A"))
                .findFirst();
    }
}