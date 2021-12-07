package com.umbrella.supplier.service.impl;

import com.umbrella.supplier.model.request.SupplierRequest;
import com.umbrella.supplier.model.response.SupplierResponse;
import com.umbrella.supplier.persistence.repository.SupplierRepository;
import com.umbrella.supplier.service.SupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    private static Logger LOGGER = LoggerFactory.getLogger(SupplierServiceImpl.class);

    @Override
    public SupplierResponse create(SupplierRequest request) {

        return null;
    }
}
