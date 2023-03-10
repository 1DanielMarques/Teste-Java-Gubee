package br.com.gubee.resource.assembler;

import br.com.gubee.domain.model.Product;
import br.com.gubee.resource.dto.ProductDTO;

public class ProductAssembler {

    public Product toDomainProduct(ProductDTO productDTO) {
       return Product.builder()
                .productName(productDTO.productName())
                .description(productDTO.description())
                .targetMarket(productDTO.targetMarket())
                .stack(productDTO.stack()).build();
    }
    public ProductDTO toDtoProduct(Product product){
        return ProductDTO.builder()
                .productName(product.getProductName())
                .description(product.getDescription())
                .targetMarket(product.getTargetMarket())
                .stack(product.getStack()).build();
    }

}
