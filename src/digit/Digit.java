package digit;

public class Digit {

    public int solusion(int i){

        int sum =0;

        while (i!=0){
            sum += i%10;
            i = i/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Digit digit = new Digit();


        if (digit.solusion(12345)==15){
            System.out.println("통과");
        }else {
            System.out.println("다시");
        }
    }
}
