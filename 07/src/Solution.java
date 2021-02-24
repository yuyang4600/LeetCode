public class Solution {
    public static void main(String[] args) {

        System.out.println(reverse(-2147648));
    }
    public static int reverse(int x) {
        if(x > 0) {
            String x_string = String.valueOf(x);
            char[] x_char = x_string.toCharArray();
            char[] y_char = new char[x_char.length];
            for(int i = 0; i < x_char.length; i ++) {
                y_char[i] = x_char[x_char.length - (i + 1)];
            }
            String new_str = new String(y_char);
            int new_x = 0;
            try {
                new_x = Integer.parseInt(new_str);
            } catch (NumberFormatException e) {
                new_x = 0;
            }
            return new_x;
        }
        else if(x < 0) {
            if (x <= Math.pow(-2, 31)) {
                return 0;
            }
            return -reverse(x*(-1));
        }else {
            return 0;
        }
    }
}
