package com.biz.makeName;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.makeName.vo.MakeNameVO;

public class MakeName {
	
	List<String> NameList; //이름
	List<MakeNameVO> NameList1; //성
	List<String> fullName;
	
	String strName; 		// 이름
	String strLastName;		// 성
	String strKorNameList;  //성+이름
	
	public MakeName(String strName,String strLastName) {
		NameList = new ArrayList();
		NameList1 = new ArrayList();
		fullName = new ArrayList();
		
		
		this.strName = strName;
		this.strLastName = strLastName;
		
	}
	
	public void FileRead1() { 
		//TODO 이름리스트 읽기
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String reader=buffer.readLine();
				if(reader == null) break;
				
				
				NameList.add(reader);
				//System.out.println(reader);
				
								
			}
			
			buffer.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
	public void FileRead2() {
		//TODO 한국인성씨 읽기
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strLastName);
			buffer = new BufferedReader(fr);
			
			while(true){
				String reader2 = buffer.readLine();
				if(reader2 == null) break;
				
				String[] lastName = reader2.split(":");
				
				MakeNameVO vo = new MakeNameVO();
				vo.setStrNum(lastName[0]);
				vo.setStrName(lastName[1]);
				vo.setStrCount(lastName[2]);
				
				NameList1.add(vo);
			
				//System.out.println(lastName[1]);
			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void RandomName() {
		
		for(int i =0; i<100; i++) {
			
			int j = (int)(Math.random()*(NameList.size()-1)); // 이름
			int k = (int)(Math.random()*NameList1.size()-1); //성
			
			String str1= NameList1.get(k).getStrName() + NameList.get(j);
			
			System.out.println(str1);
			
			fullName.add(str1);
			
			
		}
	
	}
	
	
	public void writeName(String strKorNameList) {
		
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(strKorNameList);
			
			for(String st : fullName ) {
				
				pw.println(st);
				
				
			}
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
