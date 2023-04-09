package com.example.fileupload.service;

import com.example.fileupload.model.BusinessCustomer;
import com.example.fileupload.repository.BusinessCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public class FileUploadService {

    @Autowired
    private BusinessCustomerRepository repository;

    public void saveFileInDB(String name, MultipartFile file) throws IOException {

        byte[] photoData = file.getBytes();

        BusinessCustomer businessCustomer = new BusinessCustomer();
        businessCustomer.setName(name);
        businessCustomer.setPhoto(photoData);
        repository.save(businessCustomer);

    }
}
