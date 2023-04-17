package operations;

import pojo.Student;
import pojo.Subject;

import java.util.Arrays;
import java.util.Scanner;

public class IngresaCalificacion {
    Scanner scanner = new Scanner(System.in);
    public void ingresa(int x,StudentOperations studentOperations){
        Student [] student = studentOperations.requestStudents();
        for(int i=0; i<student.length;i++) {
            //student[x].subjects[i]= new Subject();
            System.out.println("Nombre materia: ");
            String materia = scanner.next();
            student[x].subjects[i].setSubjectName(materia);
            System.out.println("Ingresa calificacion");
            int calificacion = scanner.nextInt();
            student[x].subjects[i].setCalificacion(calificacion);
        }
        //System.out.println(Arrays.toString(new Student[]{student[x]}));
    }
}
