package com.feiniaojin.application.service.content.entry;

import com.feiniaojin.ddd.hcms.domain.content.EntryEntity;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityFactory;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityId;
import com.feiniaojin.ddd.hcms.domain.content.TypeEntityId;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EntryEntityFactoryImpl implements EntryEntityFactory {

    @Override
    public EntryEntity newInstance(TypeEntityId typeEntityId) {

        EntryEntity entryEntity = new EntryEntity();

        entryEntity.setTypeEntityId(typeEntityId);

        String string = UUID.randomUUID().toString();
        EntryEntityId entryEntityId = new EntryEntityId(string);
        entryEntity.setEntryEntityId(entryEntityId);

        entryEntity.setStatus(0);

        entryEntity.setDeleted(0);
        return entryEntity;
    }
}
