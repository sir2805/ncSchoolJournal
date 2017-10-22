package by.nc.school.dev.dao;

import by.nc.school.dev.dao.entities.WorkPlanDaoEntity;

import java.util.List;
import java.util.stream.Collectors;

public class WorkPlanDao extends BaseDao<WorkPlanDaoEntity> {

    public List<WorkPlanDaoEntity> getWorkPlanForGroup(int groupNumber) {
        return entities.stream().filter(entity -> entity.getGroupNumber() == groupNumber).collect(Collectors.toList());
    }

    public List<WorkPlanDaoEntity> getWorkPlan(int groupNumber) {
        return entities;
    }

    @Override
    public WorkPlanDaoEntity create(WorkPlanDaoEntity entity) {
        return null;
    }

    @Override
    public void update(WorkPlanDaoEntity entity) {

    }

    @Override
    public void delete(WorkPlanDaoEntity entity) {

    }
}
