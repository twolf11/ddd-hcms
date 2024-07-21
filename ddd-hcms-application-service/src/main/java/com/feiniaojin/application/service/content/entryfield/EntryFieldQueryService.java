package com.feiniaojin.application.service.content.entryfield;

import com.feiniaojin.application.service.content.entryfield.dto.EntryFieldView;
import com.feiniaojin.ddd.hcms.domain.content.EntryFieldEntity;
import com.feiniaojin.ddd.hcms.domain.content.EntryFieldEntityRepository;
import com.feiniaojin.infrastructure.persistence.data.HcmsContentEntryField;
import com.feiniaojin.infrastructure.persistence.jdbc.HcmsContentEntryFieldRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntryFieldQueryService {

    @Resource
    private HcmsContentEntryFieldRepository repository;

    public List<EntryFieldView> listByEntryId(String entryId) {
        List<HcmsContentEntryField> list = repository.listByEntryId(entryId);
        return this.translates(list);
    }

    private List<EntryFieldView> translates(List<HcmsContentEntryField> list) {
        return list.stream().map(this::translate).collect(Collectors.toList());
    }

    private EntryFieldView translate(HcmsContentEntryField field) {
        EntryFieldView entryFieldView = new EntryFieldView();

        entryFieldView.setContentEntryId(field.getContentEntryId());
        entryFieldView.setEntryFieldId(field.getEntryFieldId());
        entryFieldView.setFieldId(field.getFieldId());
        entryFieldView.setEntryFieldValue(field.getEntryFieldValue());

        return entryFieldView;
    }
}
