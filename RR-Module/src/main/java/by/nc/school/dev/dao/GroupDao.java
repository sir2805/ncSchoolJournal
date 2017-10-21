package by.nc.school.dev.dao;

import by.nc.school.dev.data.FakeGroupGenerator;

import java.util.List;

public class GroupDao extends BaseDao<GroupDaoEntity> {

    private List<GroupDaoEntity> entities;

    public GroupDaoEntity get(int id) {
        if (entities == null) {
            entities = new FakeGroupGenerator().deserialize();
        }
        for (GroupDaoEntity entity : entities) {
            if (entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }

    public GroupDaoEntity create(GroupDaoEntity entity) {
        return null;
    }

    public void update(GroupDaoEntity entity) {

    }

    public void delete(GroupDaoEntity entity) {

    }
}
