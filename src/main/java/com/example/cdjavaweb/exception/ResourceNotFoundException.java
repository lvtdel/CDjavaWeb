package com.example.cdjavaweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
//    Không cần serialVersionUID nếu không có ý định Serialized/Deserialized đối tượng của lớp này
//    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String mess) {
        super(mess);
    }
}
