package Collection;
import java.util.ArrayList;
import java.util.List;
public class ListExer {
    private List<String> students;

    public ListExer(){
        this.students = new ArrayList<>();
        students.add("김경록");
        students.add("김미지");
        students.add("김민경");
        students.add("김민지");
    }

    public List<String> getStudents(){
        return  this.students;
    }

}
/*  string 타입의 List students 선언
    List인 string 타입의 students를 ArrayList로 초기화

    getStudents 메소드는 ListExer 클래스가 가지는 students 멤버가
    List<String> 타입임으로  List<String>으로 선언 되어야 한다.

*/
