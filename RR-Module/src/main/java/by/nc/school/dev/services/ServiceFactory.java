package by.nc.school.dev.services;

public class ServiceFactory {

    private static UserService userService;
    private static SubjectService subjectService;
    private static ValidationService validationService;
    private static GroupService groupService;
    private static GroupJournalService groupJournalService;
    private static MarkService markService;

    public UserService getUserService() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public SubjectService getSubjectService() {
        if (subjectService == null) {
            subjectService = new SubjectService();
        }
        return subjectService;
    }

    public ValidationService getValidationService() {
        if (validationService == null) {
            validationService = new ValidationService();
        }
        return validationService;
    }

    public GroupService getGroupService() {
        if (groupService == null) {
            groupService = new GroupService();
        }
        return groupService;
    }

    public GroupJournalService getGroupJournalService() {
        if (groupJournalService == null) {
            groupJournalService = new GroupJournalService();
        }
        return groupJournalService;
    }

    public MarkService getMarkService() {
        if (markService == null) {
            markService = new MarkService();
        }
        return markService;
    }
}
