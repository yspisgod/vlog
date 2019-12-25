package com.ysp.vlog.controller;

import com.ysp.vlog.enity.Result;
import com.ysp.vlog.service.method.StorageService;
import org.apache.coyote.InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.catalog.Catalog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class DealFile {
    @Autowired
    StorageService storageService;

    @PostMapping("/test")
    public @ResponseBody
    Result uploadFile(@RequestParam("file")MultipartFile file){
        storageService.store(file);
        return new Result(true,"上传成功");
    }
}
