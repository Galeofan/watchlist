package ru.galeofan.watchlist.service;

import org.springframework.stereotype.Service;
import ru.galeofan.watchlist.controller.dto.ContentRequest;
import ru.galeofan.watchlist.controller.dto.ContentResponse;

@Service
public class ContentService {

    public ContentResponse doWork(ContentRequest request) {
        System.out.println("Я дебилка");
        return ContentResponse.builder()
                .response("Респонсыч")
                .build();
    }

}
