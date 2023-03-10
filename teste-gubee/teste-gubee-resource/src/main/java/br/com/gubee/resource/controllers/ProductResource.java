package br.com.gubee.resource.controllers;

import br.com.gubee.domain.usecase.interfaces.CreateProduct;
import br.com.gubee.domain.usecase.interfaces.DeleteProduct;
import br.com.gubee.domain.usecase.interfaces.FindProduct;
import br.com.gubee.domain.usecase.interfaces.UpdateProduct;
import br.com.gubee.resource.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gubee/product")
public class ProductResource {
    private final CreateProduct createProduct;
    private final FindProduct findProduct;
    private final UpdateProduct updateProduct;
    private final DeleteProduct deleteProduct;

    @PostMapping("/create")
    public ResponseEntity<ProductDTO> insert(@Validated ProductDTO productDTO){

        return null;
    }


}
