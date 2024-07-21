package com.feiniaojin.application.service.content.entryfield;

import com.feiniaojin.ddd.hcms.domain.content.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EntryFieldEntityFactoryImpl implements EntryFieldEntityFactory {
    @Override
    public EntryFieldEntity newInstance(TypeEntityId typeEntityId, EntryEntityId entryEntityId, String entryFieldValue) {
        EntryFieldEntity entryFieldEntity = new EntryFieldEntity();

        entryFieldEntity.setTypeEntityId(typeEntityId);
        entryFieldEntity.setEntryEntityId(entryEntityId);
        entryFieldEntity.setEntryFieldValue(entryFieldValue);

        String idValue = UUID.randomUUID().toString();
        EntryFieldEntityId entryFieldEntityId = new EntryFieldEntityId(idValue);
        entryFieldEntity.setEntryFieldEntityId(entryFieldEntityId);

        entryFieldEntity.setDeleted(0);

        return entryFieldEntity;
    }
}
