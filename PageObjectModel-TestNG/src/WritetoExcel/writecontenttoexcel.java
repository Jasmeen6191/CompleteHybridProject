package WritetoExcel;
	import java.io.File;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
	import java.io.InputStream;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class writecontenttoexcel {
		
		public void readXLSXFile(String fileName) throws IOException {
			InputStream XlsxFileToRead = null;
			File file = new File(fileName);
			XSSFWorkbook workbook = null;
			try {
				 XlsxFileToRead = new FileInputStream(fileName);
				workbook = new XSSFWorkbook(XlsxFileToRead);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			XSSFSheet sheet = workbook.createSheet("NewSheet");
			XSSFRow row =sheet.createRow(1);
			XSSFCell cell =row.createCell(1);
			
			
			cell.setCellValue("Hello");
		
				System.out.println("Written");
				try
				{
					XlsxFileToRead.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				
				 FileOutputStream outputStream = new FileOutputStream(file);

				    //write data in the excel file

				    workbook.write(outputStream);

				    //close output stream

				    outputStream.close();
			
		}
		
		public static void main(String[] args) throws IOException {
			writecontenttoexcel writeExcel = new writecontenttoexcel();
			writeExcel.readXLSXFile("/Users/jasmeenkaur/Downloads/Bookgggxlsx.xlsx");	
		

	}
}
