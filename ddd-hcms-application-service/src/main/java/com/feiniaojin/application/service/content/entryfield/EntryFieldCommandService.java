package com.feiniaojin.application.service.content.entryfield;

import com.feiniaojin.application.service.content.entryfield.dto.EntryFieldCreateCommand;
import com.feiniaojin.ddd.hcms.domain.content.*;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EntryFieldCommandService {

    @Resource
    private EntryFieldEntityRepository repository;

    @Resource
    private EntryFieldEntityFactory factory;

    public void createEntryField(EntryFieldCreateCommand command) {
        TypeEntityId typeEntityId = new TypeEntityId(command.getTypeId());
        EntryEntityId entryEntityId = new EntryEntityId(command.getEntryId());

        EntryFieldEntity entryFieldEntity = factory.newInstance(typeEntityId, entryEntityId, command.getEntryFieldValue());

        repository.save(entryFieldEntity);
    }
}
