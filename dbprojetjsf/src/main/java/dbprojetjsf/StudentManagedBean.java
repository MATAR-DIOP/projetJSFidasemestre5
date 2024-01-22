import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class StudentManagedBean implements Serializable {

    @ManagedProperty("#{studentServiceBean}")
    private StudentServiceBean studentService;

    private List<StudentEntity> allStudents;
    private StudentEntity selectedStudent; // Ajout de la propriété selectedStudent

    // Autres propriétés et méthodes

    public void updateStudent() {
        studentService.updateStudent(selectedStudent);
        // Mettez à jour la liste des étudiants après la mise à jour
        allStudents = studentService.getAllStudents();
    }

    // Autres méthodes et getters/setters

    public List<StudentEntity> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(List<StudentEntity> allStudents) {
        this.allStudents = allStudents;
    }

    public StudentEntity getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(StudentEntity selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public StudentServiceBean getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentServiceBean studentService) {
        this.studentService = studentService;
    }
}
