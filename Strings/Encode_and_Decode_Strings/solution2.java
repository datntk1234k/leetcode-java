package Encode_and_Decode_Strings;

import java.util.ArrayList;
import java.util.List;

public class solution2 {

    // Encode a list of strings to a single string
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            // Mã hóa theo format: length#string
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    // Decode a single string back into a list of strings
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Tìm dấu '#' để lấy phần length
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1; // nhảy qua dấu '#'

            // Lấy substring theo độ dài length
            j = i + length;
            res.add(str.substring(i, j));

            // Tiếp tục cho vòng lặp tiếp theo
            i = j;
        }

        return res;
    }
}
