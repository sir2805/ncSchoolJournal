package by.nc.school.dev.user;

public abstract class User {

    protected String login;
    protected String password;
    protected String fullName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return (login != null ? login.equals(user.login) : user.login == null) && (password != null ? password.equals(user.password) : user.password == null) && (fullName != null ? fullName.equals(user.fullName) : user.fullName == null);
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }
}
