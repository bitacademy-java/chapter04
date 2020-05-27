package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			File file = new File("phone.txt");
			
			if(!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("============파일정보================");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
			
			System.out.println("============전화번호================");
			// 기반 스트림
			FileInputStream fis = new FileInputStream(file);
			
			// 보조스트림1 ( byte|byte|byte -> char )
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			// 보조스트림2 ( char|char|char|\n -> string )
			br = new BufferedReader(isr);
		
			String line = null;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");
				
				int index = 0;
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					if(index == 0) {
						System.out.print(token + ":");
					} else if(index == 1) {
						System.out.print(token + "-");
					} else if(index == 2) {
						System.out.print(token + "-");
					} else {
						System.out.print(token);
					}
					
					index++;
				}
				
				System.out.print("\n"); 
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
