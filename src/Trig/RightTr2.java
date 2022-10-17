package Trig;

public class RightTr2 {

    public void getRetengle(){
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        RightTr2 rightTr2 = new RightTr2();
        rightTr2.getRetengle();

    }
}
