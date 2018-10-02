package com.gms.web.brd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gms.web.cmm.Util;

@RestController
public class BoardCtrl2 {
	  @ResponseBody
	  @PostMapping("/uploadAjax")
	    public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception{
	        Util.log.accept("originaName: " + file.getOriginalFilename());
	        Util.log.accept("size: " + file.getSize());
	        Util.log.accept("contentType: " + file.getContentType());
	        return new ResponseEntity<>(file.getOriginalFilename(),HttpStatus.CREATED);
	    }
}
