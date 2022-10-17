package digit;

public class getDigit {
    public int solusion2(int i){

        int cnt =0;


        while (i!=0){
            i = i/10;
            cnt++;
        }
        System.out.println(cnt);
        return cnt;
    }

    public static void main(String[] args) {
        getDigit getdigit = new getDigit();

        getdigit.solusion2(12345);
    }
}
