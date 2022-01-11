package io.javabrains.springsecurityjpajavabrains.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import io.javabrains.springsecurityjpajavabrains.Entity.OrderDetail;

public class Helper {
	
	static String excel = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

	// File is of type excel or not
	public static boolean checkExcelFormat(MultipartFile file) {

		String contentType = file.getContentType();
		if (contentType.equals(excel)) {
			System.out.println("correct file uploaded");
			return true;
		} else {
			System.out.println("incorrect file uploaded");
			return false;
		}

	}

	// convert excel file to list

	public static List<OrderDetail> convertExcelToList(InputStream inputStream) {

		List<OrderDetail> list = new ArrayList<>();

		try {

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

			XSSFSheet sheet = workbook.getSheet("data");

			int rowNumber = 0;

			Iterator<Row> iterator = sheet.iterator();

			while (iterator.hasNext()) {

				Row row = iterator.next();

				if (rowNumber == 0) {

					rowNumber++;
					continue;
				}

				Iterator<Cell> cells = row.iterator();

				OrderDetail s = new OrderDetail();
				
				for (int cid = 0; cid <= 7; cid++)

//			while (cells.hasNext()) 
				{
					Cell cell = cells.next();

					switch (cid) {
					case 0:
						s.setOrderNumber(cell.getNumericCellValue());
						break;

					case 1:
						s.setStatus(cell.getStringCellValue());
						break;

					case 2:
						s.setCreationDate(cell.getDateCellValue());
						break;
					case 3:
						s.setCreationTime(cell.getDateCellValue());
						break;
					case 4:
						s.setStoreCredit(cell.getNumericCellValue());
						break;
					case 5:
						s.setAmount(cell.getNumericCellValue());
						break;

					case 6:
						s.setOrderUsername(cell.getStringCellValue());
						break;

					}

				}

				list.add(s);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
