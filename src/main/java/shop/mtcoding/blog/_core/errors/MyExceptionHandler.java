package shop.mtcoding.blog._core.errors;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import shop.mtcoding.blog._core.errors.exception.*;

import java.lang.Exception;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception400.class)
    public String ex400(Exception400 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/400";
    }

    @ExceptionHandler(Exception401.class)
    public String ex401(Exception401 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/401";
    }

    @ExceptionHandler(Exception402.class)
    public String ex402(Exception402 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/402";
    }

    @ExceptionHandler(Exception403.class)
    public String ex403(Exception403 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/403";
    }

    @ExceptionHandler(Exception404.class)
    public String ex404(Exception404 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/404";
    }

    @ExceptionHandler(Exception500.class)
    public String ex500(Exception500 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/500";
    }

    @ExceptionHandler(Exception.class)
    public String exUknown (Exception e){
        return "err/unknown";
    }
}
