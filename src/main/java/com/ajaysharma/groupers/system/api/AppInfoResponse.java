package com.ajaysharma.groupers.system.api;

public record AppInfoResponse (
        String name,
        String status,
        int javaVersion
) {

}