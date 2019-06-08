package com.vivo.shop.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class GeneratorMapper {
	
	
	private static String pathName = "D:\\DOC\\ORACLE_TABLE\\tableName.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in =  null;
		BufferedReader bf = null;
		try {
			in = new FileInputStream(new File(pathName));
			bf = new BufferedReader(new InputStreamReader(in));
			String readline = "";
			String tableName = "";
			final List<String> list = new ArrayList<>();
			while((readline = bf.readLine())!=null){
				list.add(readline);
			}

			for (int i = 0; i < list.size(); i++) {
				String s = list.get(i);
//				System.out.println("<table schema=\"\" tableName=\""+s+"\"></table>");
				String[] arr = s.split("_");
//				System.out.println(Arrays.asList(arr));
				String FeeBase = "";
				for (int j = 0; j < arr.length; j++) {
					String en = arr[j].trim();
					if (!"".equals(en) && en!=null  && !" ".equals(en)) {
						char[] cs=en.toCharArray();
				        cs[0]-=32;
				        FeeBase += String.valueOf(cs);
					}
				}
				System.out.println(FeeBase);
//				System.out.println("<table tableName=\""+s+"\" domainObjectName=\""+FeeBase+"\"	enableCountByExample=\"true\" enableUpdateByExample=\"true\"			enableDeleteByExample=\"true\" enableSelectByExample=\"true\"			selectByExampleQueryId=\"true\"></table>");
//				System.out.println("<table tableName=\""+s+"\" domainObjectName=\""+FeeBase+"\"	enableCountByExample=\"false\" enableUpdateByExample=\"false\"			enableDeleteByExample=\"false\" enableSelectByExample=\"false\"			selectByExampleQueryId=\"false\"></table>");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bf!=null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	}

}
