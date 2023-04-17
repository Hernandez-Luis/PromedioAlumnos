package operations;

import calificaciones.Calificaciones;
import operations.studentsServices.ServiceArrayStudent;
import operations.studentsServices.ServiceWriteStudent;
import pojo.Student;
import pojo.Subject;

import java.util.Scanner;

public class StudentOperations {
    public Student[] students;
    private final ServiceWriteStudent serviceWriteStudent;
    private final ServiceArrayStudent serviceArrayStudent;

    //Inyectamos dependencias a través del constructor
    public StudentOperations(ServiceArrayStudent serviceArrayStudent, ServiceWriteStudent serviceWriteStudent) {
        this.serviceArrayStudent = serviceArrayStudent;
        this.serviceWriteStudent = serviceWriteStudent;
    }

    public void registerStudents(Scanner scanner) {
        students = new Student[serviceArrayStudent.sizeArray(scanner)];
        for (int i = 0; i < students.length; i++) {
            serviceWriteStudent.writeData(scanner);
            students[i] = (Student) serviceWriteStudent.readData();
        }
    }



    public Student[] requestStudents() {
        return students;
    }

    public int countStudents() {
        return students.length;
    }


}