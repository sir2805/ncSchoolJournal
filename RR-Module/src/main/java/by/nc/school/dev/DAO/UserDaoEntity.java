package by.nc.school.dev.DAO;

import by.nc.school.dev.user.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserDaoEntity extends BaseDaoEntity implements Serializable {

    private static Map<Integer, UserFactory> factories = new HashMap<Integer, UserFactory>();

    static {
        factories.put(0, new StudentFactory());
        factories.put(1, new TutorFactory());
        factories.put(2, new DeanFactory());
    }

    private String username;
    private String password;
    private String fullName;
    private int status;
    private int groupId;

    public UserDaoEntity(String username, String password, String fullName, int status, int groupId) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
        this.groupId = groupId;
    }

    public User getUser() {
        if (status > 2) {
            throw new UnsupportedOperationException("Invalid status");
        } else {
            return factories.get(status).createUser(this);
        }
    }

    @Override
    public String toString() {
        return "UserDaoEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", status=" + status +
                ", groupId=" + groupId +
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

    public int getGroupId() {
        return groupId;
    }
}
