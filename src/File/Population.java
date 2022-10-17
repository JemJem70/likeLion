package File;

public class Population {


    private int fromSido;
    private int toSido;


    //constructor 추가 fromSido 와 toSido를 받아서 멤버변수에 넣는 기능

    public Population(int fromSido , int toSido){
        this.fromSido = fromSido;
        this.toSido = toSido;
    }
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
