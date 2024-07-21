package com.feiniaojin.application.service.content.entryfield;

import com.feiniaojin.ddd.hcms.domain.content.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EntryFieldEntityFactoryImpl implements EntryFieldEntityFactory {

    @Override
    public EntryFieldEntity newInstance(EntryEntityId entryEntityId,
                                        TypeFieldEntityId typeFieldEntityId,
                                        String fieldName,
                                        Integer fieldDataType,
                                        String fieldValue) {
        EntryFieldEntity entryFieldEntity = new EntryFieldEntity();

        entryFieldEntity.setEntryEntityId(entryEntityId);
        entryFieldEntity.setTypeFieldEntityId(typeFieldEntityId);
        entryFieldEntity.setFieldName(fieldName);
        entryFieldEntity.setFieldValue(fieldValue);
        entryFieldEntity.setFieldDataType(fieldDataType);

        String uuid = UUID.randomUUID().toString();
        entryFieldEntity.setEntryFieldEntityId(new EntryFieldEntityId(uuid));

        entryFieldEntity.setDeleted(0);
        return entryFieldEntity;
    }
}
