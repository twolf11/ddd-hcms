package com.feiniaojin.application.service.content.typefield;

import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntity;
import com.feiniaojin.ddd.hcms.domain.content.TypeFieldEntityFactory;
import org.springframework.stereotype.Component;

@Component
public class TypeFieldEntityFactoryImpl implements TypeFieldEntityFactory {
    @Override
    public TypeFieldEntity newInstance() {
        return null;
    }
}
