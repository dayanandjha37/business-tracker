package io.javabrains.springsecurityjpajavabrains.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.javabrains.springsecurityjpajavabrains.helper.Helper;
import io.javabrains.springsecurityjpajavabrains.service.MyUserDetailsService;

@RestController
public class SheetController {

	@Autowired
	MyUserDetailsService detailsService;
	
	@PostMapping("/product/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){
		
		if (Helper.checkExcelFormat(file)) {
			detailsService.save(file);
			return ResponseEntity.ok(Map.of("message","File is uploaded and data is saved to db"));
		}
	
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload correct file");
	}
	/*
	 * @GetMapping("/sheet") public List<Sheet> getAllSheet(){
	 * 
	 * return this.detailsService.getAllsSheets(); }
	 */
	
}
