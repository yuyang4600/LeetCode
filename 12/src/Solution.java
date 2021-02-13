public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = solution.intToRoman(101);
        System.out.println(str);
    }

    public String intToRoman(int num) {
        int flag = -1;
        int a = 10;
        StringBuilder sb = new StringBuilder();
        while (flag != num) {
            flag = num % a;
             if (flag < 10 && a == 10){
                if (flag == 4) {
                    sb.insert(0, "IV");
                } else if (flag == 9){
                    sb.insert(0, "IX");
                } else if (flag < 5) {
                    for (int i = 0; i < flag; i++) {
                        sb.insert(0, "I");
                    }
                } else if (flag > 5){
                    sb.append("V");
                    for (int i = 5; i < flag; i++) {
                        sb.append("I");
                    }
                } else {
                    sb.append("V");
                }
            } else if (flag >= 10 && flag < 100 && a == 100) {
                 int res = flag - flag % 10;
                 if (res == 40) {
                     sb.insert(0, "XL");
                 } else if (res == 90) {
                     sb.insert(0, "XC");
                 }else if (res < 50) {
                    for (int i = 0; i < res;) {
                        sb.insert(0, "X");
                        i = i + 10;
                    }
                } else if (res > 50){
                    for (int i = 50; i < res;) {
                        sb.insert(0, "X");
                        i = i + 10;
                    }
                     sb.insert(0, "L");
                } else {
                    sb.insert(0, "L");
                }
            } else if (flag >= 100 && flag < 1000 && a == 1000) {
                 int res = flag - flag % 100;
                 if (res == 400) {
                     sb.insert(0, "CD");
                 } else if (res == 900) {
                     sb.insert(0, "CM");
                 }else if (res < 500) {
                    for (int i = 0; i < res;) {
                        sb.insert(0, "C");
                        i = i + 100;
                    }
                } else if (res > 500){

                    for (int i = 500; i < res;) {
                        sb.insert(0, "C");
                        i = i + 100;
                    }
                     sb.insert(0, "D");
                } else {
                    sb.insert(0, "D");
                }
            }else if (flag >= 1000 && flag < 10000 && a == 10000) {
                 int res = flag - flag % 1000;
                 if (res < 5000) {
                     for (int i = 0; i < res; ) {
                         sb.insert(0, "M");
                         i = i + 1000;
                     }
                 }
             }
            a = a * 10;
        }
        return sb.toString();
    }
}
