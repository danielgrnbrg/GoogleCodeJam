package googleCodeJam2013;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	
public class Problem {
		
		public static int grab(ArrayList<Integer> list, int index){
			int temp=list.get(index);
			list.remove(index);
			return temp;
		}
		
		public static void main(String[] args) throws IOException{
			String fPath="C:\\Users\\Janbro\\Documents\\Google Code Jam\\Practice Problems";
			String fileName="A-small-attempt0 (2).txt";
			String filePath = fPath+"\\"+fileName;
			FileReader file1 = new FileReader(filePath);
			BufferedReader br = new BufferedReader(file1);
			
	        String line = br.readLine();
	        line = br.readLine();
	        ArrayList<String> board = new ArrayList<String>();
	        int Case=1;
	        while(line!=null){
	        	for(int i=0;i<4;i++){
	        		board.add(line);
	        		line = br.readLine();
	        	}
	        	int xCount=0;
	        	int oCount=0;
	        	int tCount=0;
	        	boolean fin=false;
	        	for(int j=0;j<board.size();j++){
		        	for(int i=0;i<board.get(j).length();i++){
		        		if(board.get(j).substring(i,i+1).equals("X")){
		        			xCount++;
		        		}else if(board.get(j).substring(i,i+1).equals("O")){
		        			oCount++;
		        		}else if(board.get(j).substring(i,i+1).equals("T")){
		        			tCount++;
		        		}
		        	}if(xCount+tCount==4){
		        		System.out.println("Case #"+Case+": X won" );
		        		fin=true;
		        		break;
		        	}
		        	if(oCount+tCount==4){
		        		System.out.println("Case #"+Case+": O won");
		        		fin=true;
		        		break;
		        	}tCount=0;oCount=0;xCount=0;
	        	}String[][] tempBoard = new String[4][4];
	        	for(int i=0;i<board.size();i++){
	        		for(int j=0;j<board.size();j++){
	        			tempBoard[i][j]=board.get(i).substring(j, j+1);
	        		}
	        	}
	        	for(int j=0;j<tempBoard[0].length;j++){
	        		for(int i=0;i<tempBoard.length;i++){
		        		if(tempBoard[i][j].equals("X")){
		        			xCount++;
		        		}else if(tempBoard[i][j].equals("O")){
		        			oCount++;
		        		}else if(tempBoard[i][j].equals("T")){
		        			tCount++;
		        		}
	        		}if(fin==false&&xCount+tCount==4){
		        		System.out.println("Case #"+Case+": X won" );
		        		fin=true;
		        		break;
		        	}
		        	if(fin==false&&oCount+tCount==4){
		        		System.out.println("Case #"+Case+": O won");
		        		fin=true;
		        		break;
		        	}tCount=0;oCount=0;xCount=0;
	        	}
	        	if(fin==false&&(tempBoard[0][0].equals("X")||tempBoard[0][0].equals("T"))&&(tempBoard[1][1].equals("X")||tempBoard[1][1].equals("T"))&&(tempBoard[2][2].equals("X")||tempBoard[2][2].equals("T"))&&(tempBoard[3][3].equals("X")||tempBoard[3][3].equals("T"))){
	        		System.out.println("Case #"+Case+": X won" );
	        		fin=true;
	        	}
	        	if(fin==false&&(tempBoard[0][0].equals("O")||tempBoard[0][0].equals("T"))&&(tempBoard[1][1].equals("O")||tempBoard[1][1].equals("T"))&&(tempBoard[2][2].equals("O")||tempBoard[2][2].equals("T"))&&(tempBoard[3][3].equals("O")||tempBoard[3][3].equals("T"))){
	        		System.out.println("Case #"+Case+": O won" );
	        		fin=true;
	        	}
	        	if(fin==false&&(tempBoard[0][3].equals("X")||tempBoard[0][3].equals("T"))&&(tempBoard[1][2].equals("X")||tempBoard[1][2].equals("T"))&&(tempBoard[2][1].equals("X")||tempBoard[2][1].equals("T"))&&(tempBoard[3][0].equals("X")||tempBoard[3][0].equals("T"))){
	        		System.out.println("Case #"+Case+": X won" );
	        		fin=true;
	        	}
	        	if(fin==false&&(tempBoard[0][3].equals("O")||tempBoard[0][3].equals("T"))&&(tempBoard[1][2].equals("O")||tempBoard[1][2].equals("T"))&&(tempBoard[2][1].equals("O")||tempBoard[2][1].equals("T"))&&(tempBoard[3][0].equals("O")||tempBoard[3][0].equals("T"))){
	        		System.out.println("Case #"+Case+": O won" );
	        		fin=true;
	        	}
	        	
	        	boolean draw=true;
	        	if(!fin){
	        		for(int i=0;i<board.size();i++){
	        			if(board.get(i).contains(".")){
	        				draw=false;
	        			}
	        		}if(draw){
	        			System.out.println("Case #"+Case+": Draw");
	        		}else{
	        			System.out.println("Case #"+Case+": Game has not completed");
		     	    }
	        	}
	        	Case++;
	        	line = br.readLine();
	        	board.clear();
	        }
	        
		}
}
