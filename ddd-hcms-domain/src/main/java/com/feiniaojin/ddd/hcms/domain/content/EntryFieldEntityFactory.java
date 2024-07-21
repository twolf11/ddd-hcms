package com.feiniaojin.ddd.hcms.domain.content;

public interface EntryFieldEntityFactory {

    EntryFieldEntity newInstance(TypeEntityId typeEntityId, EntryEntityId entryEntityId, String entryFieldValue);
}
