package model;

/**
 *
 * @author Marlon
 */
public class Employee extends Person {

    private String user;
    private String password;

    public Employee(String user, String password, int identification,
            String name, String lastName, Gender gender) throws Exception {
        super(identification, name, lastName, gender);
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
