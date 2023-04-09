package com.example.fileupload;

import com.example.fileupload.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("upload")
public class FileUploadController {

    @Autowired
    private FileUploadService service;

    @PostMapping(value = "/database")
    public String uploadToDatabase(@RequestParam String name, @RequestParam MultipartFile file) throws IOException {
        service.saveFileInDB(name, file);
        return "Records saved into database.";
    }

}
