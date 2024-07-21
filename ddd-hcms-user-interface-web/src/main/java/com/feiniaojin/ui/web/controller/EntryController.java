package com.feiniaojin.ui.web.controller;

import com.feiniaojin.application.service.content.entry.EntryCommandService;
import com.feiniaojin.application.service.content.entry.EntryQueryService;
import com.feiniaojin.application.service.content.entry.dto.EntryCreateCommand;
import com.feiniaojin.application.service.content.entry.dto.EntryView;
import com.feiniaojin.application.service.content.type.dto.TypeView;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/content-entries")
public class EntryController {

    @Resource
    private EntryCommandService commandService;

    @Resource
    private EntryQueryService queryService;

    @PutMapping
    @ResponseBody
    public void addNewEntry(@RequestBody EntryCreateCommand command) {
        commandService.createEntry(command);
    }

    @PostMapping
    @ResponseBody
    public Page<EntryView> pageList() {
        return queryService.pageList();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public EntryView queryOne(@PathVariable String id) {
        return queryService.findOne(id);
    }
}
