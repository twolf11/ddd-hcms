package com.feiniaojin.application.service.content.entry;

import com.feiniaojin.ddd.hcms.domain.content.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EntryEntityFactoryImpl implements EntryEntityFactory {

    @Override
    public EntryEntity newInstance(TypeEntityId typeEntityId) {
        EntryEntity entry = new EntryEntity();

        entry.setTypeEntityId(typeEntityId);

        String idValue = UUID.randomUUID().toString();
        EntryEntityId entryEntityId = new EntryEntityId(idValue);
        entry.setEntryEntityId(entryEntityId);

        entry.setDeleted(0);
        return entry;
    }
}
