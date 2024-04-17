package com.bjpowernode.crm.poi;

import com.bjpowernode.crm.commons.utils.HSSFUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;

public class ParseExcelTest {
    public static void main(String[] args) throws Exception{
        //根据excel文件生成HSSFWorkbook对象，封装excel文件的所有信息
        InputStream is = new FileInputStream("C:\\Users\\lixin\\Desktop\\activity.xls");
        HSSFWorkbook wb=new HSSFWorkbook(is);
        //根据wb获取HSSFSheet对象，封装了一页的所有信息
        HSSFSheet sheet = wb.getSheetAt(0);//页的下标，从0开始，依次增加
        //根据sheet获取HSSFRow对象，封装了一行的所有信息
        HSSFRow row=null;
        HSSFCell cell=null;
        for (int i=0;i<=sheet.getLastRowNum();i++){//sheet.getLastRowNum() 最后一行的下标
             row = sheet.getRow(i);//行的下标，从0开始，依次增加
             for (int j=0;j<row.getLastCellNum();j++){ //row.getLastCellNum()最后一列的下标+1
                 //根据row获取HSSFCell对象，封装了一列的所有信息
                 cell=row.getCell(j);//列的下标，从0开始，依次增加
                 //获取列中的数据
                 /*if (cell.getCellType()==HSSFCell.CELL_TYPE_STRING){
                     System.out.print(cell.getStringCellValue()+" ");
                 } else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC) {
                     System.out.print(cell.getNumericCellValue()+" ");
                 } else if (cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN) {
                     System.out.print(cell.getBooleanCellValue()+" ");
                 } else if (cell.getCellType()==HSSFCell.CELL_TYPE_FORMULA) {
                     System.out.print(cell.getCellFormula()+" ");
                 }else {
                     System.out.print("");
                 }*/
                 System.out.print(HSSFUtils.getCellValueForStr(cell)+" ");
             }
//             每一行所有列打完。换行
            System.out.println();
        }
    }


}
