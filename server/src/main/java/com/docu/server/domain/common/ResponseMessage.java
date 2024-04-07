package com.docu.server.domain.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseMessage {

    private Object data;
    private int statusCode;
    String resultMessage;
    String detailMessage;
}