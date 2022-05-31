import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getCode() {
        Student student = new Student(1,"Test",null);
        assertEquals(1,student.getCode());
    }
}