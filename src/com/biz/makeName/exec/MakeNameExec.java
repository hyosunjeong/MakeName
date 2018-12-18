package com.biz.makeName.exec;

import com.biz.makeName.MakeName;

public class MakeNameExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strName = "src/com/biz/makeName/이름리스트.txt";
		String strLastName = "src/com/biz/makeName/한국인성씨.txt";
		String strKorNameList = "src/com/biz/makeName/한국인이름리스트.txt";
		
		MakeName mn = new MakeName(strName,strLastName);
		
		mn.FileRead2();
		mn.FileRead1();
		mn.RandomName();
		mn.writeName(strKorNameList);
		
		

	

	
	}

}
