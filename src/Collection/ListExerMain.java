package Collection;

import java.util.List;

public class ListExerMain {

    public static void main(String[] args) {
        ListExer listExer = new ListExer();

        List<String> students=listExer.getStudents();
        for (String student : students){
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
