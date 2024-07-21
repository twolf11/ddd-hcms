package com.feiniaojin.infrastructure.persistence;

import com.feiniaojin.ddd.hcms.domain.content.EntryEntity;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityId;
import com.feiniaojin.ddd.hcms.domain.content.EntryEntityRepository;
import com.feiniaojin.ddd.hcms.domain.content.TypeEntityId;
import com.feiniaojin.infrastructure.persistence.data.HcmsContentEntry;
import com.feiniaojin.infrastructure.persistence.jdbc.HcmsContentEntryRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class EntryEntityRepositoryImpl implements EntryEntityRepository {

    @Resource
    private HcmsContentEntryRepository hcmsContentEntryRepository;

    @Override
    public EntryEntity load(EntryEntityId entryEntityId) {

        HcmsContentEntry data = hcmsContentEntryRepository.findOneByBizId(entryEntityId.getValue());

        EntryEntity entity = new EntryEntity();
        entity.setEntryEntityId(entryEntityId);
        entity.setTypeEntityId(new TypeEntityId(data.getContentTypeId()));

        entity.setId(data.getId());
        entity.setVersion(data.getVersion());
        entity.setDeleted(data.getDeleted());

        return entity;
    }

    @Override
    public void save(EntryEntity entity) {

        HcmsContentEntry data = new HcmsContentEntry();

        data.setId(entity.getId());
        data.setVersion(entity.getVersion());
        data.setCreatedBy(entity.getCreatedBy());
        data.setCreatedTime(entity.getCreatedTime());
        data.setModifiedBy(entity.getModifiedBy());
        data.setModifiedTime(entity.getModifiedTime());
        data.setDeleted(entity.getDeleted());

        data.setContentTypeId(entity.getTypeEntityId().getValue());
        data.setContentEntryId(entity.getEntryEntityId().getValue());
        data.setStatus(entity.getStatus());

        hcmsContentEntryRepository.save(data);
    }
}
