//package com.datadriven.test;
//
//import com.utility.Xls_Reader;
//
//public class ExcelOperations {
//
//    public static void main(String[] args) {
//        // Get test data from xl
//        Xls_Reader reader = new Xls_Reader("/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/" +
//                "com/testdata/HalfEbayTestData.xlsx");
//
//
//        if(!reader.isSheetExist("HomePage")) {
//            reader.addSheet("HomePage");
//        }
//
//        int colCount = reader.getColumnCount("RegTestData");
//        System.out.println(colCount);
//
//        System.out.println(reader.getCellRowNum("RegTestData","firstname","B"));
//    }
//
//
//
//}
