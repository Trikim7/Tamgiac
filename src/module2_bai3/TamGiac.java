package module2_bai3;

public class TamGiac {
    private int ma,mb,mc;
    public  TamGiac(){
        this.ma=1;
        this.mb=1;
        this.mc=1;
    }
    public TamGiac(int a,int b,int c){
        if ((a + b > c)&& (b + c > a) && (a + c > b)){
            this.setMa(a);
            this.setMb(b);
            this.setMC(c);
        }
        else {
            this.ma = 1;
            this.mb = 1;
            this.mc = 1;
        }

    }
    //set,get
    public void setMa(int a){
        if (a> 0)
            this.ma=a;
        else this.ma=1;

    }
    public void setMb(int b){
        if (b > 0)
            this.mb=b;
        else this.mb=1;
    }
    public void setMC(int c){
        if (c > 0)
            this.mc=c;
        else this.mc=1;
    }
    public int getMa(){
        return this.ma;
    }
    public int getMb(){
        return this.mb;

    }
     public int getMC(){
        return this.mc;

     }
     public int getP(){
        return this.ma+this.mb+this.mc;
     }
     public double getS(){
        double mp = (double) this.getP()/2;
        return Math.sqrt(mp*(mp-ma) * (mp-mb) * (mp-mc));
     }
     //override
     public String toString(){
        return "ma= "+this.ma+"\t mb= "+this.mb+"\t mc= "+this.mc+"\t ChuVi= "+this.getP()+"\t DienTich: "+this.getS();
     }
}
