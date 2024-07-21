package com.feiniaojin.application.service.content.entryfield.dto;

import lombok.Data;

@Data
public class EntryFieldCreateCommand {

    private String entryId;

    private String typeId;

    private String entryFieldValue;
}
