package ru.galeofan.watchlist.controller.dto;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class ContentRequest {

    String request;

}
