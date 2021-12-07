package com.umbrella.supplier.ws.v1;

import com.umbrella.supplier.model.request.SupplierRequest;
import com.umbrella.supplier.model.response.SupplierResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @PostMapping
    public ResponseEntity<SupplierResponse> create(SupplierRequest request){
        return ResponseEntity.ok(new SupplierResponse());
    }
}
