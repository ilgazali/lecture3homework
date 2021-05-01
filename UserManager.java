public class UserManager {

    public void girisYap(User user){
        System.out.println(user.getClass().getName()+" "+user.getIsim()+" giriş yaptı");
    }
    public void girisYapanlarKaydi(User[] users){
        for (User u : users){
            girisYap(u);
        }
    }

}
