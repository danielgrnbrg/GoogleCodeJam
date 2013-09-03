package PracticeProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProblemC {
	public static void main(String[] args) throws IOException{
		String fPath="C:\\Users\\Janbro\\Documents\\Google Code Jam\\Practice Problems";
		String fileName="C-large.txt";
		String filePath = fPath+"\\"+fileName;
		FileReader file1 = new FileReader(filePath);
		BufferedReader br = new BufferedReader(file1);
		
	    String line = br.readLine();
	    line = br.readLine();
	    int count=1,prevNum=-1,num,times;
	    String[] map = {" ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	    while(line!=null){
	    	
	    	String temp = line;
	    	num=0;
	    	times=0;
	    	
	    	String temps[] = temp.split("");
    		System.out.print("Case #"+count+": ");
		    for(int i=0;i<temps.length;i++){
		    	if(!temps[i].isEmpty()){
		    		String b = temps[i];
		    		for(int x=0;x<map.length;x++){
		    			if(map[x].contains(b)){
		    				num = x+1;
		    				if(num==1)
		    					num=0;
		    				times = map[x].indexOf(b)+1;
		    			}
		    		}
		    	}
	    		if(prevNum==num)
	    			System.out.print(" ");
	    		for(int x=0;x<times;x++){
		    		System.out.print(num);
		    	}
		    	prevNum=num;
		   	}System.out.println();
	    	count++;
	    	line = br.readLine();
	    	prevNum=-1;
	    }
	    
	    br.close();
	}

}
