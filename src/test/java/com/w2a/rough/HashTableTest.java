package com.w2a.rough;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashTableTest
{
	
	
	@Test(dataProvider = "getData")
	public void testFun(Hashtable<String,String> data)
	{
		System.out.println(data.get("head1"));
		System.out.println(data.get("head2"));
		System.out.println(data.get("head3"));
	}

	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] sourceData =
		{
				{ "head1", "head2", "head3" },
				{ 11, 12, 13 },
				{ 21, 22, 23 },
				{ 31, 32, 33 },
		};
		
		int totalrows = sourceData.length;
		int totalcols = sourceData[0].length;

//		System.out.println(sourceData[0][0]);
//		System.out.println(sourceData[0][1]);
//		System.out.println(sourceData[0][2]);
//		System.out.println(sourceData[1][0]);
//		System.out.println(sourceData[1][1]);
//		System.out.println(sourceData[1][2]);

		// Object[][] data = new Object[rows - 1][1];
		Object[][] data = new Object[totalrows-1][1];

		Hashtable<String, String> table = null;
		
		for (int row = 1; row < totalrows; row++)
		{
			table = new Hashtable<String, String>();
			for (int col = 0; col < totalcols; col++)
			{
				// data[0][0]
				table.put(sourceData[0][col].toString(), sourceData[row][col].toString());
			}
			data[row-1][0] = table;
			//System.out.println(data[row - 1][0]);
		}
		
		//System.out.println("********************************************************");
		
//		for(Entry<String,String> e: table.entrySet())
//		{
//			//System.out.println(e.getKey()+" "+e.getValue());
//		}
		
		return data;

	}
}
