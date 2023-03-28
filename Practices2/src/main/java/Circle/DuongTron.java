package Circle;
public class DuongTron {
    private int bankinh= 1;
    private String mau="red";

    public DuongTron() {

    }

    public DuongTron(int x, String y) {
        this.bankinh = x;
        this.mau = y;
    }

     void setBankinh(int x) {
        this.bankinh = x;
    }

     void setMau(String y) {
        this.mau = y;
    }

    public int getBankinh() {
        return bankinh;
    }

    public String getMau() {
        return mau;
    }
}
