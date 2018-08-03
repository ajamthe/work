package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testSave() {
        Student student = new Student();
        student.setId("2");
        student.setName("Alex");
        student.setGender(Student.Gender.MALE);
        studentRepository.save(student);

        Student std = studentRepository.findById("2").get();

        System.out.print(std);

    }
}

