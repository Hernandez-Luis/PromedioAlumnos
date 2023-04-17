package options;

import calificaciones.Calificaciones;
import calificaciones.ValidaCalificacion;
import operations.StudentOperations;
import operations.SubjectOperation;
import operations.TeacherOperation;

import java.util.Scanner;

public class MenuMain {
    private final SubjectOperation subjectOperation;
    private final TeacherOperation teacherOperation;
    private final StudentOperations studentOperations;
    private final Scanner scanner;
    private final RegistrationMenu registrationMenu;

    public MenuMain(Scanner scanner, SubjectOperation subjectOperation, TeacherOperation teacherOperation, StudentOperations studentOperations) {
        this.scanner = scanner;
        this.subjectOperation = subjectOperation;
        this.teacherOperation = teacherOperation;
        this.studentOperations = studentOperations;
        registrationMenu = new RegistrationMenu();
    }

    public void menuPrincipal() {
        ValidaCalificacion validaCalificacion = new ValidaCalificacion();
        showOption();
        String menuOption = scanner.next();
        switch (menuOption) {
            case "1" ->
                    registrationMenu.registration(scanner,subjectOperation, teacherOperation, studentOperations);
            case "2" ->
                    QueryMenu.registrationAssignment(scanner, subjectOperation, teacherOperation, studentOperations);
            default -> System.out.println("Opción invalida");
        }
        menuPrincipal();
    }

    private void showOption() {
        System.out.println("""
                Bienvenido al sistema de asignación de materias:\s
                Escriba la operación a realizar:
                1.- Registrar\s
                2.- Consultar\s""");
    }

}
