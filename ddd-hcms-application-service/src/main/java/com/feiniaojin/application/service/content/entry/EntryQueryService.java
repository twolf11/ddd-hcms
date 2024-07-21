package com.feiniaojin.application.service.content.entry;

import com.feiniaojin.application.service.content.entry.dto.EntryView;
import com.feiniaojin.application.service.content.entryfield.EntryFieldQueryService;
import com.feiniaojin.application.service.content.entryfield.dto.EntryFieldView;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntity;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityId;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityRepository;
import com.feiniaojin.ddd.hcms.domain.content.EntryFieldEntityRepository;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryQueryService {

    @Resource
    private EntryEntityRepository entityRepository;

    @Resource
    private EntryFieldQueryService entryFieldQueryService;

    public Page<EntryView> pageList() {
        return null;
    }

    public EntryView findOne(String id) {
        EntryEntity entryEntity = entityRepository.load(new EntryEntityId(id));
        return this.translate(entryEntity);
    }

    private EntryView translate(EntryEntity entryEntity) {
        EntryView entryView = new EntryView();
        entryView.setEntryId(entryEntity.getEntryEntityId().getValue());
        entryView.setTypeId(entryEntity.getTypeEntityId().getValue());

        List<EntryFieldView> entryFieldList = entryFieldQueryService.listByEntryId(entryEntity.getEntryEntityId().getValue());
        entryView.setEntryFields(entryFieldList);
        return entryView;
    }
}
