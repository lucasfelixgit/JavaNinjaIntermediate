package Records;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi!👋");

        Ninja naruto = new Ninja("Naruto", "naruto@konoha.com", 999999999);

        System.out.println(naruto);
        System.out.println(naruto.getName());

        NinjaRecord sasuke = new NinjaRecord("Sasuke", "sasuke@konoha.com", 111111111);

        System.out.println(sasuke);
        System.out.println(sasuke.uppercaseEmail());
        System.out.println(sasuke.email()); //different notation, but works the same as getters*
    }
}
