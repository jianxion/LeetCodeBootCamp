public class ReverseWords {

    public static String reverseWords(String s) {
        // remove trailing and leading white spaces
        String removed = s.strip();

        // split by \\s+
        String[] str_list = removed.split("\\s+");

        // add to result from back to front
        StringBuilder sb = new StringBuilder();
        for (int i = str_list.length - 1; i >= 0; i--) {
            sb.append(str_list[i] + " ");
        }

        // remove extra last space
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public static void main (String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
