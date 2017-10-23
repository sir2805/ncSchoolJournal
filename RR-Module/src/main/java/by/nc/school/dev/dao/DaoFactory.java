package by.nc.school.dev.dao;

public class DaoFactory {

    private static UserDao userDao;
    private static GroupDao groupDao;
    private static WorkPlanDao workPlanDao;
    private static SubjectDao subjectDao;
    private static JournalDao journalDao;

    public UserDao getUserDao() {
        if (userDao == null) {
            userDao = new UserDao();
        }
        return userDao;
    }

    public GroupDao getGroupDao() {
        if (groupDao == null) {
            groupDao = new GroupDao();
        }
        return groupDao;
    }

    public WorkPlanDao getWorkPlanDao() {
        if (workPlanDao == null) {
            workPlanDao = new WorkPlanDao();
        }
        return workPlanDao;
    }

    public SubjectDao getSubjectDao() {
        if (subjectDao == null) {
            subjectDao = new SubjectDao();
        }
        return subjectDao;
    }

    public JournalDao getJournalDao() {
        if (journalDao == null) {
            journalDao = new JournalDao();
        }
        return journalDao;
    }
}
