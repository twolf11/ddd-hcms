package com.feiniaojin.ddd.hcms.domain.content;

import com.feiniaojin.ddd.AbstractDomainMask;
import lombok.Data;

/**
 * @author qinyujie
 */
@Data
public class EntryFieldEntity extends AbstractDomainMask {

    private EntryFieldEntityId entryFieldEntityId;

}
