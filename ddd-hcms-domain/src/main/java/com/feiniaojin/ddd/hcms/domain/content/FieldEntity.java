package com.feiniaojin.ddd.hcms.domain.content;

import com.feiniaojin.ddd.AbstractDomainMask;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 内容属性实体
 *
 * @author qinyujie
 */
@Data
@Slf4j
public class FieldEntity extends AbstractDomainMask {

    private FieldEntityId fieldEntityId;

    private String fieldName;

    private Integer fieldDataType;

    private Integer status;
}
