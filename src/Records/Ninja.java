package Records;

public class Ninja {

    private final String name;
    private final String email;
    private final int phone;

    public Ninja(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
