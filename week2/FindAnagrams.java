import java.util.*;
import java.util.stream.Collectors;

public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        // maintain a sliding window of size p.length()
        int len = p.length();
        int l = 0;
        char[] char_arr_p = p.toCharArray();
        Arrays.sort(char_arr_p);
        String sorted_p = new String(char_arr_p);

        List<Integer> res = new ArrayList<>();
        for (int r = 0; r < s.length(); r++) {
            if (r - l + 1 == len) {
                String substring = s.substring(l, r + 1);
                char[] char_arr = substring.toCharArray();
                Arrays.sort(char_arr);
                String sorted = new String(char_arr);
                if (sorted.equals(sorted_p)) {
                    res.add(l);
                }
                l++;
            }
        }
        return res;
    }


    public static void main (String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> res = findAnagrams(s, p);
        for (int i : res) System.out.println(i);
    }
}
