package com.ssafy.wayg.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class ErrorController {

    @GetMapping("/error")
    public void handleError(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());
            if (statusCode == HttpStatus.FORBIDDEN.value()) {
                response.sendRedirect("https://early-honeycrisp-704.notion.site/0-a0000ed62e984039841342adb53fad24");
            }
        }
    }
}