package com.datadriven.test;

import com.utility.Xls_Reader;

import java.util.ArrayList;

public class TestUtil {
    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel() {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();

        reader = new Xls_Reader("/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/" +
                "com/testdata/HalfEbayTestData.xlsx");

        for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {

            String firstName = reader.getCellData("RegTestData","firstname",rowNum);
            String lastName = reader.getCellData("RegTestData","lastname",rowNum);
            String address1 = reader.getCellData("RegTestData","address1",rowNum);
            String address2 = reader.getCellData("RegTestData","address2",rowNum);
            String city = reader.getCellData("RegTestData","city",rowNum);
            String state = reader.getCellData("RegTestData","state",rowNum);
            String zipcode = reader.getCellData("RegTestData","zipcode",rowNum);
            String emailaddress = reader.getCellData("RegTestData","emailaddress",rowNum);

            Object ob[] = {firstName,lastName,address1,address2,city,state,zipcode,emailaddress};
            myData.add(ob);

            myData.add(new Object[] {"firstName",});
        }
            return myData;
    }

}
