package com.feiniaojin.ddd.hcms.domain.content;

import com.feiniaojin.ddd.AbstractDomainMask;
import lombok.Data;

/**
 * 内容属性实体
 *
 * @author qinyujie
 */
@Data
public class FieldEntity extends AbstractDomainMask {

    private FieldEntityId fieldEntityId;

    private String fieldName;

    private Integer fieldDataType;

    private Integer status;
}
