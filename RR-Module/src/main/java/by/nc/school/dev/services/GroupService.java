package by.nc.school.dev.services;

import by.nc.school.dev.enitities.Group;
import by.nc.school.dev.builders.GroupBuilder;
import by.nc.school.dev.dao.GroupDao;
import by.nc.school.dev.dao.entities.GroupDaoEntity;

import java.util.List;

public class GroupService {

    public Group getGroupBygroupNumber(int groupNumber) {
        List<GroupDaoEntity> entity = new GroupDao().getGroupByGroupNumber(groupNumber);
        Group group = new GroupBuilder().build(entity);
        return group;
    }
}
