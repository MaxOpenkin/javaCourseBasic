package homeworks.homework_21.bankAccount;

public class User {

    private String login;
    private String password;
    private String email;


    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }


    private boolean isSecurePassword(String password){
        return password.length() >= 6;
    }


    public boolean setPassword(String oldPassword, String newPassword){
        if (oldPassword.equals(password) && isSecurePassword(newPassword)){
            password = newPassword;
            return true;
        }
        return false;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
