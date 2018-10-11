package com.zzu.offer;

import org.junit.Test;

/**
 * 二维数组中，每一行都从左到右递增排序， 每一列都从上到下递增排序
 * 判断数组中是否含有该整数
 * 
 * @author Administrator
 *
 */
public class FindInPartiallySortedMatrix {


	/**
	 * 从右上角开始查找，大于右上角删除一行，小于右上角的删除一列
	 * @param matrix
	 * @param rows
	 * @param columns
	 * @param number
	 * @return
	 */
	public boolean find(int matrix[][], int rows, int columns, int number) {
        //是否查询到
		boolean found = false;

		if (matrix != null && rows > 0 && columns > 0) {
			int row = 0;//从0行开始
			int column = columns - 1;//右上角
			while (row < rows && column >= 0) {
				if (matrix[row][column] == number) {
					found = true;
					break;
				} else if (matrix[row][column] > number)//小于右上角的删除一列
					--column;
				else
					++row;//大于右上角删除一行
			}
		}

		return found;

	}

	public void test(String testName, int matrix[][], int rows, int columns, int number, boolean expected){
		if(testName != null)
	        System.out.println("begins: "+testName);

	    boolean result = find(matrix, rows, columns, number);
	    if(result == expected)
	    	System.out.println("Passed");
	    else
	    	System.out.println("Failed");
	}
	@Test
	public void test1()
	{
	    int matrix[][] = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
	    test("Test1", matrix, 4, 4, 7, true);
	}
}
