public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ali","123456789","antalya");
        Instructor instructor = new Instructor("Engin","3");

        User [] users = {student,instructor};

        UserManager userManager = new UserManager();
        userManager.girisYapanlarKaydi(users);




    }
}
