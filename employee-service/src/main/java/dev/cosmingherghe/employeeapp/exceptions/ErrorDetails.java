package dev.cosmingherghe.employeeapp.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
    private Instant time;
    private String message;
    private String details;
}
