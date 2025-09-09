package lettcode;

import java.util.HashSet;
import java.util.Set;

public class longest2 {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> seen = new HashSet<>(); // dùng để lưu trữ ký tự 
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (seen.contains(c)) {
                    break;
                }
                seen.add(c); 
            maxLen = Math.max(maxLen, j - i + 1);   
            }
            // Cập nhật đồ dài chuỗi 
        }   
        return maxLen;
    }
}
