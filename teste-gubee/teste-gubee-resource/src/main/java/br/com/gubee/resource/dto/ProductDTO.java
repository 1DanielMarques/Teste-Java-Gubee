package br.com.gubee.resource.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record ProductDTO(@NotBlank String productName, @NotBlank String description, List<String> targetMarket,
                         List<String> stack) {
}
