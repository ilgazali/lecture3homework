public class Instructor extends User {
    private String toplamKurs;

    public Instructor(String isim, String toplamKurs) {
        super(isim);
        this.toplamKurs = toplamKurs;
    }

    public String getToplamKurs() {
        return toplamKurs;
    }

    public void setToplamKurs(String toplamKurs) {
        this.toplamKurs = toplamKurs;
    }
}
