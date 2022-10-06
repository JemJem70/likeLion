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

/*
    메인에서 ListExer 클래스를 사용하려면
    ListExer를 선언해주어야한다.

    ListExer를 초기화 했으면 listExer.getStudents()로
    stdents를 초기화 해줄 수 있다.
    students는 학생이름 List를 나타낸다.
 */