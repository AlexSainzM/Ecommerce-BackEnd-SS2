package com.ecommerce.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.service.FileUploadService;

@RestController
@RequestMapping(path = "/file")
public class FileUploadController {
    private final FileUploadService fileUploadService;

    @Autowired
    public FileUploadController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    // Controller for file upload
    @PostMapping()
    public void uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        fileUploadService.saveFile(file);
        System.out.println("File uploaded successfully");
    }
}
