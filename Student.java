public class Student extends User {

    private String telNo;
    private String address;

    public Student(String isim, String telNo, String address) {
        super(isim);
        this.telNo = telNo;
        this.address = address;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
