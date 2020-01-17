package com.sinc.intern.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileObj {
	public void saveToFile(File file, String msg) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(msg);
			System.out.println("save to OK");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void loadToFile(File file) {
		FileReader fw = null;
		BufferedReader bw = null;
		
		try {
			fw = new FileReader(file);
			bw = new BufferedReader(fw);
			String read = bw.readLine();
			System.out.println(read);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// close()는 예외를 던지는 코드이기 때문에 예외처리 해주는 것을 권장
				bw.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
