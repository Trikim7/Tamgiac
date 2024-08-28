package module2_bai3;

public class test {
    // TODO Auto-generated method stub
    public static void main(String[] args) {
        TamGiac tg1,tg2,tg3 ,tg4 ,tg5 ;
        tg1 = new TamGiac();
        tg2 = new TamGiac(3,3,-2);
        tg3 = new TamGiac(5,3,7);
        tg4 = new TamGiac(5,8,5);
        tg5 = new TamGiac(5,5,5);


        System.out.println(tg1.toString());
        System.out.println(tg2.toString());
        System.out.println(tg3.toString());
        System.out.println(tg4.toString());
        System.out.println(tg5.toString());
    }

}
