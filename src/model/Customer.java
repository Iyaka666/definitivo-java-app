package model;

/**
 *
 * @author Marlon
 */
public class Customer extends Person {

    private long phone;
    private String email;
    private int points;

    public Customer(long phone, String email, long identification,
            String name, String lastName, Gender gender) throws Exception {
        super(identification, name, lastName, gender);
        this.phone = phone;
        this.email = email;
        this.points = 0;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

}
