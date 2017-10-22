package by.nc.school.dev.data;

import by.nc.school.dev.dao.entities.SubjectJournalDaoEntity;

import java.io.File;
import java.util.List;

public class FakeSubjectJournalGenerator extends AbstractFakeGenerator<SubjectJournalDaoEntity> {

    private final String filepath = filedir + File.separator + "fakeSubjectJournals.txt";
    @Override
    public void serialize() {

    }

    @Override
    public List<SubjectJournalDaoEntity> deserialize() {
        return null;
    }
}
