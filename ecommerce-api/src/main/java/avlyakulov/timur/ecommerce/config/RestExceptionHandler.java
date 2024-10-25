package avlyakulov.timur.ecommerce.config;

import avlyakulov.timur.ecommerce.dto.ErrorDto;
import avlyakulov.timur.ecommerce.exception.AppException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = {AppException.class})
    public ResponseEntity<ErrorDto> handleException(AppException ex) {
        return ResponseEntity.status(ex.getHttpStatus())
                .body(new ErrorDto(ex.getMessage()));
    }
}