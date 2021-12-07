package com.umbrella.supplier.service;

import com.umbrella.supplier.model.request.SupplierRequest;
import com.umbrella.supplier.model.response.SupplierResponse;

public interface SupplierService {

    SupplierResponse create(SupplierRequest request);
}
