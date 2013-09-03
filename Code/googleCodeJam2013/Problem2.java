package googleCodeJam2013;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem2 {
	
	public static int grab(ArrayList<Integer> list, int index){
		int temp=list.get(index);
		list.remove(index);
		return temp;
	}
	
	public static boolean isPalindrome(String f){
		String temp="";
		for(int j=f.length();j>0;j--){
			temp+=f.substring(j-1,j);
		}
		if(temp.equals(f)){
			return true;
		}return false;
	}
	
	public static void main(String[] args) throws IOException{
		String fPath="C:\\Users\\Janbro\\Documents\\Google Code Jam\\Practice Problems";
		String fileName="C-large-2.txt";
		String filePath = fPath+"\\"+fileName;
		FileReader file1 = new FileReader(filePath);
		BufferedReader br = new BufferedReader(file1);
		
        String line = br.readLine();
        line = br.readLine();
        int count=0;
        int Case=1;
        while(line!=null){
        	String[] nums = line.split(" ");
        	BigInteger i1=new BigInteger(nums[0]);
        	BigInteger i2=new BigInteger(nums[1]);
        	for(int i=(int)(Math.sqrt(i1));i<=(int)(Math.sqrt(Long.parseLong(nums[1])));i++){
        		if(isPalindrome(""+i)){
        			if(isPalindrome(""+(int)Math.pow(i,2))){
        				count++;
        			}
        		}
        	}
        	
        	System.out.println("Case #"+Case+": "+count);
        	count=0;
        	Case++;
        	line=br.readLine();
        }
	}
}
