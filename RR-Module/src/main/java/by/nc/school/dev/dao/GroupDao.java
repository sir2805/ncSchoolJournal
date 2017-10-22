package by.nc.school.dev.dao;

import by.nc.school.dev.dao.entities.GroupDaoEntity;
import by.nc.school.dev.data.FakeGroupGenerator;

import java.util.ArrayList;
import java.util.List;

public class GroupDao extends BaseDao<GroupDaoEntity> {

    public GroupDao() {
        this.entities = new FakeGroupGenerator().deserialize();
    }

    public List<GroupDaoEntity> getGroupByGroupNumber(int groupNumber) {
        List<GroupDaoEntity> result = new ArrayList<>();
        for (GroupDaoEntity entity : entities) {
            if (entity.getGroupNumber() == groupNumber) {
                result.add(entity);
            }
        }
        return result;
    }

    public GroupDaoEntity create(GroupDaoEntity entity) {
        return null;
    }

    public void update(GroupDaoEntity entity) {

    }

    public void delete(GroupDaoEntity entity) {

    }
}
