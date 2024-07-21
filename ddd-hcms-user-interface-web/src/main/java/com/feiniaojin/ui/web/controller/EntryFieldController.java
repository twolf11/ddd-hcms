package com.feiniaojin.ui.web.controller;

import com.feiniaojin.application.service.content.entryfield.EntryFieldCommandService;
import com.feiniaojin.application.service.content.entryfield.EntryFieldQueryService;
import com.feiniaojin.application.service.content.entryfield.dto.EntryFieldCreateCommand;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/content-entry-fields")
public class EntryFieldController {

    @Resource
    private EntryFieldQueryService queryService;

    @Resource
    private EntryFieldCommandService commandService;

    @PutMapping
    @ResponseBody
    public void addNewEntryField(@RequestBody EntryFieldCreateCommand command) {
        commandService.createEntryField(command);
    }
}
