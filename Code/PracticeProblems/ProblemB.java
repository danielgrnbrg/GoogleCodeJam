package PracticeProblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProblemB {
	
	
	public static void main(String[] args) throws IOException{
		String fPath="C:\\Users\\Janbro\\Documents\\Google Code Jam\\Practice Problems";
		String fileName="B-large.txt";
		String filePath = fPath+"\\"+fileName;
		FileReader file1 = new FileReader(filePath);
		BufferedReader br = new BufferedReader(file1);
		
        String line = br.readLine();
        line = br.readLine();
        int count=1;
        while(line!=null){
        	
        	
        	String temp = line;
        	
        	System.out.print("Case #"+count+": ");
        	if(temp.contains(" ")){
        		String[] temps = temp.split(" ");
        		for(int i=temps.length-1;i>=0;i--){
        			System.out.print(temps[i]+" ");
        		}System.out.println();
        	}else
        		System.out.println(temp);
        	
 	       	line = br.readLine();
 	       	count++;
        }
        
        br.close();
	}
}