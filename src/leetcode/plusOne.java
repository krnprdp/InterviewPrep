package leetcode;

public class plusOne {

    public static int[] plusOnefunc(int[] digits) {
        
        int carry = 1;
        
        int len = digits.length;
//        digits[len - 1] += 1;
        
        for (int i = len - 1 ; i >=0; i--) {
        	
        	digits[i] += carry;
        	
        	if (digits[i] >= 10) {
        		carry = digits[i] / 10;
        		digits[i] = digits[i] % 10;
        	} else {
        		return digits;
        	}
        	
        }
        
        int[] op = new int[len + 1];
        op[0] = carry;
        for (int i = 1; i<=len;i++) {
        	op[i] = digits[i-1];
        }
        
        return op;
    }
    
    public static void main(String[] args){
    	int[] digit = {9,1};
    	for (int i = 0 ; i < digit.length; i++)
    		System.out.println(digit[i]);
    	int[] op = plusOnefunc(digit);
    	System.out.println("test");
    	for (int i = 0 ; i < op.length; i++)
    		System.out.println(op[i]);
    }
}
