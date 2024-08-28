package module2_bai3;

public class test {
    // TODO Auto-generated method stub
    public static void main(String[] args) {
        TamGiac tg1,tg2;
        tg1 = new TamGiac();
        tg2 = new TamGiac(3,3,4);
        System.out.println(tg1.toString());
        System.out.println(tg2.toString());
        ////
        tg1.setMa(4);
        tg1.setMb(5);
        tg1.setMC(6);

        System.out.println(tg1.toString());
    }

}
