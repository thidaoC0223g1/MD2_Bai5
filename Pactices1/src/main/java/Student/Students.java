package Student;
public class Students {
    private int rollno;
    private String name;
    private static String college = "DAY NGHE THANH XUAN";

    public Students(int i,String j) {
        this.rollno=i;
        this.name=j;
    }
    static void change(){
        college = "DAY NGHE NGUYEN TRAI";
    }
    public void hienthi(){
        System.out.println(rollno +" " + name+ " " + college);
    }
}
