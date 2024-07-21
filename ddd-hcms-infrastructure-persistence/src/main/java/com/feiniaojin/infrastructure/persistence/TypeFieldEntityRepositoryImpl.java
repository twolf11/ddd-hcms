package com.feiniaojin.infrastructure.persistence;

import com.feiniaojin.ddd.hcms.domain.content.TypeEntityId;
import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntity;
import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntityId;
import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntityRepository;
import com.feiniaojin.infrastructure.persistence.data.HcmsContentTypeField;
import com.feiniaojin.infrastructure.persistence.jdbc.HcmsContentTypeFieldRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class TypeFieldEntityRepositoryImpl implements TypeFieldEntityRepository {

    @Resource
    private HcmsContentTypeFieldRepository hcmsContentTypeFieldRepository;

    @Override
    public TypeFieldEntity load(TypeFieldEntityId entityId) {

        HcmsContentTypeField data = hcmsContentTypeFieldRepository.findOneByBizId(entityId.getValue());

        TypeFieldEntity entity = new TypeFieldEntity();

        entity.setStatus(data.getStatus());
        entity.setFieldName(data.getFieldName());
        entity.setTypeFieldEntityId(entityId);
        entity.setFieldDataType(data.getFieldDataType());
        entity.setTypeEntityId(new TypeEntityId(data.getContentTypeId()));

        //version id
        entity.setId(data.getId());
        entity.setVersion(data.getVersion());
        entity.setDeleted(data.getDeleted());

        return entity;
    }

    @Override
    public void save(TypeFieldEntity entity) {
        HcmsContentTypeField data = new HcmsContentTypeField();

        data.setId(entity.getId());
        data.setVersion(entity.getVersion());
        data.setCreatedBy(entity.getCreatedBy());
        data.setCreatedTime(entity.getCreatedTime());
        data.setModifiedBy(entity.getModifiedBy());
        data.setModifiedTime(entity.getModifiedTime());
        data.setDeleted(entity.getDeleted());

        data.setFieldName(entity.getFieldName());
        data.setFieldDataType(entity.getFieldDataType());
        data.setStatus(entity.getStatus());
        data.setFieldId(entity.getTypeFieldEntityId().getValue());
        data.setContentTypeId(entity.getTypeEntityId().getValue());

        hcmsContentTypeFieldRepository.save(data);
    }
}
