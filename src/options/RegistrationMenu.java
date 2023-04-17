package options;

import calificaciones.Calificaciones;
import calificaciones.ValidaCalificacion;
import operations.StudentOperations;
import operations.SubjectOperation;
import operations.TeacherOperation;
import pojo.Student;

import java.util.Scanner;

public class RegistrationMenu {
    ValidaCalificacion validaCalificacion = new ValidaCalificacion();
    public void registration(Scanner scanner, SubjectOperation subjectOperation, TeacherOperation teacherOperation, StudentOperations studentOperations) {
        //Student [] student = studentOperations.requestStudents();
        showOption();
        String option = scanner.next();
        switch (option) {
            case "1" -> studentOperations.registerStudents(scanner);
            case "2" -> teacherOperation.registerTeachers(scanner);
            case "3" -> validaCalificacion.validacionCalificacion(subjectOperation,scanner,studentOperations);
            case "4" -> new MenuMain(scanner, subjectOperation, teacherOperation, studentOperations).menuPrincipal();
            default -> System.out.println("Opción invalida");
        }
        registration(scanner, subjectOperation, teacherOperation, studentOperations);
    }

    private static void showOption() {
        System.out.println("""
                Escriba la operación de registro a realizar:\s
                1.- Alumnos\s
                2.- Profesores\s
                3.- Materias/Calificaciones\s
                4.- Regresar\s
                """);
    }
}
