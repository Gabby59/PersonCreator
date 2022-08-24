public class Author {

    //private variables
    private String name;
    private String email;
    private char gender;

    //constructors
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //getters and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // returns the author object as a String
    public String toString(){
        return name +", "+email+", "+ gender;
    }
}
