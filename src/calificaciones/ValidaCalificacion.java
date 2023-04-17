package calificaciones;

import operations.Compara;
import operations.IngresaCalificacion;
import operations.StudentOperations;
import operations.SubjectOperation;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class ValidaCalificacion {
    Compara compara = new Compara();
    IngresaCalificacion ingresaCalificacion = new IngresaCalificacion();
    public void validacionCalificacion (SubjectOperation subjectOperation, Scanner scanner,StudentOperations studentOperations){
        System.out.println("Elige al alumno para ingresar la calificacion\n");
        System.out.println(Arrays.toString(studentOperations.students));
        String name = scanner.next();
        int x = compara.comparacion(name,studentOperations);
        ingresaCalificacion.ingresa(x,studentOperations);


    }
}
