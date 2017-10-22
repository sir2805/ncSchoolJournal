package by.nc.school.dev.dao;

public class DaoFactory {

    public UserDao getUserDao() {
        return new UserDao();
    }

    public GroupDao getGroupDao() {
        return new GroupDao();
    }

    public WorkPlanDao getWorkPlanDao() {
        return new WorkPlanDao();
    }

    public SubjectDao getSubjectDao() {
        return new SubjectDao();
    }

    public JournalDao getJournalDao() {
        return new JournalDao();
    }
}
