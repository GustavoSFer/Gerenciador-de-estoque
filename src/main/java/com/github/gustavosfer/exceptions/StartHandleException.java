package com.github.gustavosfer.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import java.time.Instant;

@Data
@AllArgsConstructor
public class StartHandleException {

    private String error;
    private Instant instant;
    private HttpStatus status;

}
