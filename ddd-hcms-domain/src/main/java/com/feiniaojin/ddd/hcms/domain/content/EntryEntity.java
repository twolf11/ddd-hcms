package com.feiniaojin.ddd.hcms.domain.content;

import com.feiniaojin.ddd.AbstractDomainMask;

/**
 * @author qinyujie
 */
public class EntryEntity extends AbstractDomainMask {

    /**
     * 内容实例的唯一标识
     */
    private EntryEntityId entryEntityId;

    /**
     * 内容类型id
     */
    private TypeEntityId typeEntityId;

    /**
     * 状态
     */
    private Integer status;
}
