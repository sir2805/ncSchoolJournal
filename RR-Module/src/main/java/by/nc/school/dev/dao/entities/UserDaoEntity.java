package by.nc.school.dev.dao.entities;

public class UserDaoEntity extends BaseDaoEntity {

    private String username;
    private String password;
    private String fullName;
    private int status;
    private int groupNumber;

    public UserDaoEntity(int id, String username, String password, String fullName, int status, int groupNumber) {
        super(id);
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "UserDaoEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", status=" + status +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public int getStatus() {
        return status;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}
