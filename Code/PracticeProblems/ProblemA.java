package PracticeProblems;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProblemA {
	
	private static int N,C,l;
	
	public static int grab(ArrayList<Integer> list, int index){
		int temp=list.get(index);
		list.remove(index);
		return temp;
	}
	
	public static void main(String[] args) throws IOException{
		String fPath=System.getProperty("user.home") + "\\Desktop";
		String fileName="A-large.txt";
		String filePath = fPath+"\\"+fileName;
		FileReader file1 = new FileReader(filePath);
		BufferedReader br = new BufferedReader(file1);
		
        String line = br.readLine();
		ArrayList<Integer> my_list = new ArrayList<Integer>();
        
        while(line!=null){
        	
        	String temp = line;
        	
        	if(temp.contains(" ")){
        		String[] temps = temp.split(" ");
        		for(String a:temps){
        			my_list.add(Integer.parseInt(a));
        		}
        	}else
        		my_list.add(Integer.parseInt(temp));
        	
 	       	line = br.readLine();
        }
        
        br.close();
		
        N = grab(my_list,0);
		for(int x=0;x<N;x++){
			C=grab(my_list,0);
			l=grab(my_list,0);
			int[] this_list = new int[l];
			for(int a=0;a<l;a++)
				this_list[a]=grab(my_list,0);
			cred(C,l,this_list,x+1);
		}
	}
	
	public static void cred(int C, int l, int[] list,int count){
		for(int i=0;i<list.length;i++){
			for(int k=i+1;i!=k;k++){
				if(k>=list.length)
					k=-1;
				else if(list[i]+list[k]==C){
					System.out.print("Case #"+count+": ");
					if(k<i)
						System.out.print((k+1)+" "+(i+1)+"\n");
					else
						System.out.print((i+1)+" "+(k+1)+"\n");
					return;
				}
			}
		}
	}

}
