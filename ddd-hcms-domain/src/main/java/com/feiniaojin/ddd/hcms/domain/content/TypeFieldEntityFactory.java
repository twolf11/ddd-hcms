package com.feiniaojin.ddd.hcms.domain.content;

/**
 * @author qinyujie
 */
public interface TypeFieldEntityFactory {

    TypeFieldEntity newInstance(TypeEntityId typeEntityId, String fieldName, Integer fieldDataType);
}
