package tests;

import com.app.utilities.ExcelUtils;

public class ExcelPractice2 {
	public static void main(String[] args) {

		ExcelUtils.openExcelFile("Workbook6.xlsx", "Sheet2");
		String data = ExcelUtils.getCellData(1, 1);
		System.out.println("Before:"+data);
		ExcelUtils.setCellData("newValue:", 1, 1);
		String data2 = ExcelUtils.getCellData(5, 10);
		System.out.println("after:"+data2);

	}
}
