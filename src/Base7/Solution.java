package Base7;

class Solution {
	
	
	
    public static String convertToBase7(int num) {
    	
    	int a = num / 7;
    	int b = num % 7;
    	String result = Integer.toString(b);
    	
    	
    	
    	if(a==0)
    		return Integer.toString(b);
    	else
    		result = convertToBase7(a);
    	return result + Math.abs(b);
        
    }
    
    public static void main(String args[])
    {
    	System.out.println(convertToBase7(-8));
    }
    
}
