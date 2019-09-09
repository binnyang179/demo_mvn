package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUploadController {
//    SimpleDateFormat spdt = new SimpleDateFormat("yyyy-mm-dd");

    @PostMapping("/upload")
//    public String upload(MultipartFile[] uploadFile, HttpServletRequest req) {
    public String upload(MultipartFile uploadFile, HttpServletRequest req) {

//        String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
        String realPath = "/home/crab179/IdeaProjects/demo_mvn/src/main/resources/static/";
//        String format = spdt.format(new Date());
//        File folder = new File(realPath + format);
        File folder = new File(realPath);
        if (!folder.isDirectory()) {
            folder.mkdir();
        }
        String oldName = uploadFile.getOriginalFilename();
//        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        String newName = oldName;
        try {
            uploadFile.transferTo(new File(folder, newName));
//            String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName;
            String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/" + newName;
            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failed upload";
    }

}
