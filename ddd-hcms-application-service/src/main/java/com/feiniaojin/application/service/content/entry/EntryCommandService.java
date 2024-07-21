package com.feiniaojin.application.service.content.entry;

import com.feiniaojin.application.service.content.entry.dto.EntryCreateCommand;
import com.feiniaojin.ddd.hcms.domain.content.*;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EntryCommandService {

    @Resource
    private EntryEntityRepository repository;

    @Resource
    private EntryEntityFactory factory;

    public void createEntry(EntryCreateCommand command) {
        TypeEntityId TypeEntityId = new TypeEntityId(command.getTypeId());

        EntryEntity entry = factory.newInstance(TypeEntityId);

        repository.save(entry);
    }
}
