package io.javabrains.springsecurityjpajavabrains.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import io.javabrains.springsecurityjpajavabrains.Entity.Sheet;

public class Helper {

	static String excel = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

	// File is of type excel or not
	public static boolean checkExcelFormat(MultipartFile file) {

		String contentType = file.getContentType();
		if (contentType.equals(excel)) {

			return true;
		} else {
			return false;
		}

	}

	// convert excel file to list

	public List<Sheet> convertExcelToList(InputStream inputStream) {

		List<Sheet> list = new ArrayList<>();

		try {

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

			XSSFSheet sheet= workbook.getSheet("data");

			int rowNumber=0;
			
			Iterator<Row> iterator=sheet.iterator();
			
			while (iterator.hasNext()) {
				Row row = iterator.next();
			if(rowNumber==0) {
				rowNumber++;
				continue;
			}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
