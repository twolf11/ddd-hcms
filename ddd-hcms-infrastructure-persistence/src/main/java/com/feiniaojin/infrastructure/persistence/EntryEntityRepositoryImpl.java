package com.feiniaojin.infrastructure.persistence;

import com.feiniaojin.ddd.hcms.domain.content.EntryEntity;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityId;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityRepository;

public class EntryEntityRepositoryImpl implements EntryEntityRepository {


    @Override
    public EntryEntity load(EntryEntityId entryEntityId) {
        return null;
    }

    @Override
    public void save(EntryEntity entryEntity) {

    }
}
