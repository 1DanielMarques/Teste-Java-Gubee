package br.com.gubee.resource.controllers;

import br.com.gubee.domain.usecase.interfaces.CreateProduct;
import br.com.gubee.domain.usecase.interfaces.DeleteProduct;
import br.com.gubee.domain.usecase.interfaces.FindProduct;
import br.com.gubee.domain.usecase.interfaces.UpdateProduct;
import br.com.gubee.resource.assembler.ProductAssembler;
import br.com.gubee.resource.config.SpringContextConfiguration;
import br.com.gubee.resource.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/gubee/product")
@RequiredArgsConstructor
@Import(SpringContextConfiguration.class)
public class ProductResource {
    private final CreateProduct createProduct;
    private final FindProduct findProduct;
    private final UpdateProduct updateProduct;
    private final DeleteProduct deleteProduct;
    private final ProductAssembler assembler;

    @PostMapping("/create")
    public ResponseEntity<ProductDTO> insert(@RequestBody @Validated ProductDTO productRequest) {
        ProductDTO productDTO = assembler.toDtoProduct(createProduct.createProduct(assembler.toDomainProduct(productRequest)));
        return ResponseEntity.ok().body(productDTO);
    }

    @GetMapping("find")
    public ResponseEntity<ProductDTO> findAll(){

        return null;
    }

}

