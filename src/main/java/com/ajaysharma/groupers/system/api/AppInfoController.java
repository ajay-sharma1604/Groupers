package com.ajaysharma.groupers.system.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app-info")
public class AppInfoController {

    @GetMapping
    public AppInfoResponse getAppInfo() {
        return new AppInfoResponse(
                "Groupers",
                "running",
                Runtime.version().feature()
        );
    }
}
