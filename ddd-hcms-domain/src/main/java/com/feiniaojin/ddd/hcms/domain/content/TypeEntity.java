package com.feiniaojin.ddd.hcms.domain.content;

import com.feiniaojin.ddd.AbstractDomainMask;
import lombok.Data;

/**
 * 内容类型
 *
 * @author qinyujie
 */
@Data
public class TypeEntity extends AbstractDomainMask {

    private TypeEntityId typeEntityId;

    private String displayName;

    private Integer status;
}
