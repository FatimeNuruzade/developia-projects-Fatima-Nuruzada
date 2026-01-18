package az.developia.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepo repository;

    public StudentService(StudentRepo repository) {
        this.repository = repository;
    }
    public Student save(Student student) {
        return repository.save(student);
    }
    public List<Student> getAll() {
        return repository.findAll();
    }
    public Student getById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}