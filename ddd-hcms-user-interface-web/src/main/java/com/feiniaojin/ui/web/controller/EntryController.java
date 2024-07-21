package com.feiniaojin.ui.web.controller;

import com.feiniaojin.application.service.content.entry.EntryCommandService;
import com.feiniaojin.application.service.content.entry.dto.EntryCreateCommand;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content-entries")
public class EntryController {

    @Resource
    private EntryCommandService commandService;

    @PostMapping
    public void createEntry(@RequestBody EntryCreateCommand command) {
        commandService.createEntry(command);
    }
}
