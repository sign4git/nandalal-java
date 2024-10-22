package com.example.EcomSpringBoot.controller;

import com.example.EcomSpringBoot.model.Product;
import com.example.EcomSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        try {
            List<Product> productList = productService.getAllProducts();
            return new ResponseEntity<>(productList, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable("productId") Integer productId){
        try{
            Product product = productService.getProductById(productId);
            if(null != product)
                return new ResponseEntity<>(product, HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product,
                                        @RequestPart MultipartFile imageFile){
        try{
            Product addedProduct = productService.addOrUpdateProduct(product,imageFile);
            return new ResponseEntity<>(addedProduct,HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/product/{productId}/image")
    public ResponseEntity<?> getProductImageById(@PathVariable("productId") Integer productId){
        try{
            Product product = productService.getProductById(productId);
            if(null != product)
                return new ResponseEntity<>(product.getImageData(), HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<?> updateProduct(@RequestPart Product product,
                                        @RequestPart MultipartFile imageFile,
                                           @PathVariable Integer productId){
        Product updatedProduct;
        try{
            if(productService.getProductById(productId)!=null) {
                updatedProduct = productService.addOrUpdateProduct(product, imageFile);
                return new ResponseEntity<>(updatedProduct, HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> deleteProductById(@PathVariable Integer productId){
        productService.deleteProductById(productId);
        return new ResponseEntity<>("Successfully Deleted Product",HttpStatus.OK);
    }

    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProductByKeyword(@RequestParam String keyword){
        try {
            List<Product> productsByKeyword = productService.getProductsByKeyword(keyword);
            if(productsByKeyword.isEmpty())
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            return new ResponseEntity<>(productsByKeyword,HttpStatus.OK);

        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
