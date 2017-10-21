package by.nc.school.dev.user;

public abstract class User {

    enum Status {
        STUDENT, TUTOR, DEAN
    }

    protected Status status;
    protected String login;
    protected String password;
    protected String fullName;

    public User(String login, String password, String fullName, int status) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        switch (status) {
            case 1:
                this.status = Status.STUDENT;
                break;
            case 2:
                this.status = Status.TUTOR;
                break;
            case 3:
                this.status = Status.DEAN;
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (status != user.status) return false;
        if (!login.equals(user.login)) return false;
        if (!password.equals(user.password)) return false;
        return fullName.equals(user.fullName);
    }

    @Override
    public int hashCode() {
        int result = status.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + fullName.hashCode();
        return result;
    }

    public Status getStatus() {
        return status;
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
