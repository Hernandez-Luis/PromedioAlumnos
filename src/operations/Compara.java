package operations;

public class Compara {
    public int comparacion(String name,StudentOperations studentOperations){
        int x=0;
        while(!name.equals(studentOperations.students[x].getIdStudent())){
            x++;
        }
        //System.out.println(studentOperations.students[x].getName());
        return x;
    }
}
