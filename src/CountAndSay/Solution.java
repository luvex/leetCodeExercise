package CountAndSay;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
	
	static ArrayList<String> javaList= new ArrayList<String>();
	static ArrayList<String> webList= new ArrayList<String>();
	static ArrayList<String> dadmList= new ArrayList<String>();
	
    static String[] fsd_team(String[] staff_info) {
    	for(String s : staff_info)
    	{
    		String[] person = s.split(",");
    		if(person[1].equals("java"))
    		{
    			javaList.add(person[0]);
    		}
    		else if(person[1].equals("web"))
    		{
    			webList.add(person[0]);
    		}
    		else
    		{
    			dadmList.add(person[0]);
    		}
    	}
    	
    	int numDmDa = dadmList.size();
    	int numWeb = webList.size();
    	int numJava = javaList.size();
    	
    	String[] result;
    	if(numDmDa%2 == 0)
    	{
    		result = new String[(int) Math.ceil((double)numDmDa /2)+(int) Math.ceil((double)numJava /2)];
    	}
    	else
    	{
    		result = new String[(int) Math.ceil((double)numDmDa /2)+(int) Math.ceil((double)(numDmDa-1) /2)];
    	}
    	
    	for(int i =0;i<(int) Math.ceil((double)numDmDa /2);i++)
    	{
    		result[i] = result[i] +  dadmList.get(i*2)+",";
    		if(dadmList.size() != i*2 +1)
    		{
    			result[i] = result[i] + dadmList.get(i*2 +1)+",";
    		}
    		else
    			result[i] = result[i] + webList.get(0)+",";
    		result[i] += javaList.get(i%numJava);
    	}
    	int indexWeb = 0;
    	int indexDadm = 0;
    	if(numDmDa%2 == 0)
    	{
    		for(int i =(int) Math.ceil((double)numDmDa /2);i<(int) Math.ceil((double)numDmDa /2)+(int) Math.ceil((double)numJava /2);i++)
    		{
    			result[i] = result[i] + webList.get(indexWeb++%numWeb)+",";
    			result[i] = result[i]+dadmList.get(indexDadm++)+",";
    			result[i] = result[i]+dadmList.get(indexDadm++);
    		}
    	}
    	else
    	{
    		for(int i =(int) Math.ceil((double)numDmDa /2);i<(int) Math.ceil((double)numDmDa /2)+(int) Math.ceil((double)(numDmDa-1) /2);i++)
    		{
    			result[i] = result[i] + webList.get(indexWeb++%numWeb)+",";
    			result[i] = result[i]+dadmList.get(indexDadm++)+",";
    			result[i] = result[i]+dadmList.get(indexDadm++);
    		}
    	}
    	
    	
		return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] res;
            
        int _staff_info_size = 0;
        _staff_info_size = Integer.parseInt(in.nextLine().trim());
        String[] _staff_info = new String[_staff_info_size];
        String _staff_info_item;
        for(int _staff_info_i = 0; _staff_info_i < _staff_info_size; _staff_info_i++) {
            try {
                _staff_info_item = in.nextLine();
            } catch (Exception e) {
                _staff_info_item = null;
            }
            _staff_info[_staff_info_i] = _staff_info_item;
        }
  
        res = fsd_team(_staff_info);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
