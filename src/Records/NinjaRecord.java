package Records;

public record NinjaRecord(String name, String email, int phone) {

    /*
    * Records:
    * all attributes are final by design. NO SETTERS*
    * all core build-in features are included in records (constructor(allArgs*), getters, toString, equals and hashcode.
    * */

    public String uppercaseEmail() {
        return email.toUpperCase();
    }

}
