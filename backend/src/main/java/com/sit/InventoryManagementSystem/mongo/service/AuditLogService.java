package com.sit.InventoryManagementSystem.mongo.service;

import org.springframework.stereotype.Service;

@Service
public class AuditLogService {
    public void logAction(String username, String adminName, String action, String details) {
        // Temporary stub — just print to console
        System.out.println(
            String.format("[AuditLog Stub] User: %s, Admin: %s, Action: %s, Details: %s",
                username, adminName, action, details)
        );
    }
}
