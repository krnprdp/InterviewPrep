package leetcode;

public class reverseWords {

    public static String reverseWordsFunc(String s) {
        
        if (s.length() == 1)
            return s.trim();
        
        
        char[] rev = s.toCharArray();
//        System.out.println(rev.length);
//        System.out.println(rev[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = rev.length - 1; i >= 0; i--) {
            if (rev[i] == ' ') continue;

            sb.append(rev[i]+"").append(" ");
            
        }
        System.out.println(sb);
        return sb.toString().trim();
    }
    
    public static void main(String[] args) {
    	System.out.println(reverseWordsFunc("1 "));
    	StringBuilder sb = new StringBuilder();
    	String a = "1";
    	sb.append(a.toCharArray()[0]);
//    	System.out.println(sb.toString());
    	
    }
	
}
