package Logic;

public class Users {
    private String idusers;
    private String login;
    private String password;
    private String access;

    public Users() {
    }

    public Users(String idusers, String login, String password, String access) {
        this.idusers = idusers;
        this.login = login;
        this.password = password;
        this.access = access;
    }

    public String getIdusers() {
        return idusers;
    }

    public void setIdusers(String idusers) {
        this.idusers = idusers;
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

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
