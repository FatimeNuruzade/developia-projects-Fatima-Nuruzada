package az.developia.student;


import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentContr {

    private final StudentService service;

    public StudentContr(StudentService service) {
        this.service = service;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.save(student);
    }
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return service.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteById(id);
    }
}