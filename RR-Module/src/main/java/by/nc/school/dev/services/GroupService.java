package by.nc.school.dev.services;

import by.nc.school.dev.Group;
import by.nc.school.dev.builders.GroupBuilder;
import by.nc.school.dev.dao.GroupDao;
import by.nc.school.dev.dao.GroupDaoEntity;

public class GroupService {

    public Group getGroupById(int groupId) {
        GroupDaoEntity entity = new GroupDao().get(groupId);
        Group group = new GroupBuilder().build(entity);
        return group;
    }
}
