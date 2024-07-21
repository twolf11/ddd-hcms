package com.feiniaojin.ddd.hcms.domain.content;

public interface EntryFieldEntityFactory {

    EntryFieldEntity newInstance(EntryEntityId entryEntityId,
                                 TypeFieldEntityId typeFieldEntityId,
                                 String fieldName,
                                 Integer fieldDataType,
                                 String fieldValue);
}
