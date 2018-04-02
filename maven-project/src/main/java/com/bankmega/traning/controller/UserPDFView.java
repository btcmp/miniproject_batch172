package com.bankmega.traning.controller;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class UserPDFView extends AbstractPdfView {

   protected void buildPdfDocument(Map<String, Object> model, Document document,
      PdfWriter pdfWriter, HttpServletRequest request, HttpServletResponse response)
      throws Exception {
	   
	   PdfPTable table = new PdfPTable(3);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);

		table.addCell("First Name");
		table.addCell("Last Name");
		table.addCell("Email");

		/*for (UserDetails user : users) {
			table.addCell(user.getFirstName());
			table.addCell(user.getLastName());
			table.addCell(user.getEmail());
		}*/
		document.add(table);
	 
       }
}