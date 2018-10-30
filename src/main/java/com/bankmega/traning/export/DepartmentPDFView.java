package com.bankmega.traning.export;


import com.bankmega.traning.model.Department;
import com.bankmega.traning.model.User;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class DepartmentPDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc, PdfWriter document, HttpServletRequest arg3,
			HttpServletResponse arg4) throws Exception {
		// TODO Auto-generated method stub
		   List<Department> departments = (List<Department>) model.get("departments");
		   PdfPTable table = new PdfPTable(2);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);

			table.addCell("Department");
			table.addCell("Lokasi");

			for (Department dept : departments) {
				table.addCell(dept.getDepartmentName());
				table.addCell(dept.getLocation());
			}
			
			doc.add(table);

	}

}