package br.com.gubee.resource.dto;

import java.util.List;

public record ProductDTO(String productName, String description, List<String> targetMarket, List<String> stack) {
}
