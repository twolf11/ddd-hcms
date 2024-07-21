package com.feiniaojin.application.service.content.typefield;

import com.feiniaojin.ddd.hcms.domain.content.TypeEntityId;
import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntity;
import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntityFactory;
import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntityId;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TypeFieldEntityFactoryImpl implements TypeFieldEntityFactory {

    @Override
    public TypeFieldEntity newInstance(TypeEntityId typeEntityId, String fieldName, Integer fieldDataType) {

        TypeFieldEntity typeField = new TypeFieldEntity();
        typeField.setTypeEntityId(typeEntityId);
        typeField.setFieldName(fieldName);
        typeField.setFieldDataType(fieldDataType);

        String string = UUID.randomUUID().toString();
        TypeFieldEntityId typeFieldEntityId = new TypeFieldEntityId(string);
        typeField.setTypeFieldEntityId(typeFieldEntityId);

        typeField.setDeleted(0);

        return typeField;
    }
}
