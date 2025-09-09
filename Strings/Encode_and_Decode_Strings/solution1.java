package Encode_and_Decode_Strings;

import java.util.ArrayList;
import java.util.List;

public class solution1 {

    // Encode a list of strings into a single string
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();

        // Lưu độ dài của từng string
        for (String str : strs) {
            sizes.add(str.length());
        }

        // Encode độ dài, ngăn cách bằng dấu ","
        for (int size : sizes) {
            res.append(size).append(",");
        }
        res.append("#"); // dấu hiệu kết thúc phần size

        // Encode nội dung các string
        for (String str : strs) {
            res.append(str);
        }

        return res.toString();
    }

    // Decode a single string back into a list of strings
    public List<String> decode(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;

        // Đọc phần size trước dấu '#'
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }

        i++; // bỏ qua dấu '#'

        // Dùng size để tách string gốc
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }

        return res;
    }
}
