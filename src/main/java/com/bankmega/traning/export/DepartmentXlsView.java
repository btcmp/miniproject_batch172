package com.bankmega.traning.export;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.bankmega.traning.model.Department;

public class DepartmentXlsView extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		 // change the file name
	    response.setHeader("Content-Disposition", "attachment; filename=\"my-xls-file.xls\"");

	    @SuppressWarnings("unchecked")
	    List<Department> departments = (List<Department>) model.get("departments");

	    // create excel xls sheet
	    Sheet sheet = workbook.createSheet("Department Detail");
	    sheet.setDefaultColumnWidth(30);

	    // create style for header cells
	    sheet.getWorkbook ().createCellStyle ();
	    final CellStyle style = workbook.createCellStyle();
	    Font font = workbook.createFont();
	    font.setFontName("Arial");
	    style.setFillForegroundColor(HSSFColor.BLUE.index);
	    //style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    font.setBold(true);
	    font.setColor(HSSFColor.BLACK.index);
	    style.setFont(font);


	    // create header row
	    Row header = sheet.createRow(0);
	    header.createCell(0).setCellValue("Department");
	    header.getCell(0).setCellStyle(style);
	    header.createCell(1).setCellValue("Location");
	    header.getCell(1).setCellStyle(style);
	    int rowCount = 1;
	    
	    //fill multiple data row
	    for(Department user : departments){
	        Row userRow =  sheet.createRow(rowCount++);
	        userRow.createCell(0).setCellValue(user.getDepartmentName());
	        userRow.createCell(1).setCellValue(user.getLocation());
	    }
	    
	}


}
