package com.feiniaojin.ui.web.controller;

import com.feiniaojin.application.service.content.TypeCommandService;
import com.feiniaojin.application.service.content.TypeQueryService;
import com.feiniaojin.application.service.content.dto.TypeCreateCommand;
import com.feiniaojin.application.service.content.dto.TypeView;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/type")
public class TypeController {

    @Resource
    private TypeCommandService commandService;

    @Resource
    private TypeQueryService queryService;

    @ResponseBody
    @PutMapping
    public void create(@RequestBody TypeCreateCommand createCommand) {
        commandService.createTypeDraft(createCommand);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public TypeView queryOne(@PathVariable String id) {
        return queryService.findOne(id);
    }
}
