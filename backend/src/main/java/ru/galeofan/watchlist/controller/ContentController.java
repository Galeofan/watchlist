package ru.galeofan.watchlist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.galeofan.watchlist.controller.dto.ContentRequest;
import ru.galeofan.watchlist.controller.dto.ContentResponse;
import ru.galeofan.watchlist.service.ContentService;

@RestController
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class ContentController {

    private final ContentService contentService;

    @PostMapping(path = "/api/v1/content")
    public ContentResponse addContent(@RequestBody ContentRequest request) {
        return ResponseEntity.ok(contentService.doWork(request)).getBody();
    }

}
