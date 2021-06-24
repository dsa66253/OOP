package backend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Crawler {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Runtime rt = Runtime.getRuntime();
////		Process pr = rt.exec("python");
////		String command = "python crawler.py";
//		String command = "echo hello";
//		Process p = Runtime.getRuntime().exec(command);
//		Runtime.getRuntime().exec("echo hello");
		Process process = Runtime.getRuntime().exec("./script.sh");
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
//		System.out.println(line);
//		int returnValue = process.waitFor();
//		System.out.println(String.format("Return: %d", returnValue));
	}

}
