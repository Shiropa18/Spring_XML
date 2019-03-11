package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFotuneService implements FotuneService {

	@Override
	public String getFotune() {

		String a = "";

		ArrayList<String> b = new ArrayList<String>();

		String fileName = "F:\\Spring Project Eclipse\\Git\\Spring_XML\\PracticeActivityAnnotation\\src\\com\\luv2code\\springdemo\\text.txt";

		String line = null;

		int linenumber = 0;

		try {

			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				a += line + "\n";
				
				b.add(linenumber, line);
				
				linenumber++;

			}
			
			bufferedReader.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		
		
		Random random = new Random();
		
		int rand = random.nextInt(linenumber);
		
		String item = b.get(rand);
		
		String all = "\nAll from text file:\n" + a + "\nRandom Print: " + item; 

		return  all;
	}

	@Override
	public String getNewFotune() {

		ArrayList<String> b = new ArrayList<String>();

		String fileName = "F:\\Spring Project Eclipse\\Git\\Spring_XML\\PracticeActivityAnnotation\\src\\com\\luv2code\\springdemo\\text.txt";

		String line = null;

		int linenumber = 0;

		try {

			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				b.add(linenumber, line);
				
				linenumber++;

			}
			
			bufferedReader.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		
		
		Random random = new Random();
		
		int rand = random.nextInt(linenumber);
		
		String item = b.get(rand);
		

		return  item;
	}

}
