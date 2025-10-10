public class MyAtoi {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;
        s = s.strip();
        if (s.length() == 0) return 0;

        int i = 0;
        int num = 0;
        int sign = 1;

        char first_char = s.charAt(0);
        if (first_char == '-') {
            sign = -1;
            i++;
        } else if (first_char == '+') {
            i++;
        } else if (Character.isDigit(first_char)) {
            num = first_char - '0';
            i++;
        } else {
            return 0;
        }

        while (i < s.length()) {
            char cur_char = s.charAt(i);
            if (!Character.isDigit(cur_char)) {
                break;
            }

            int digit = cur_char - '0';

            // Overflow check (before adding)
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}