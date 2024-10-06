public class Main {

        // 1. parenthesesCheck

        public static boolean parenthesesCheck(String str) {
                int open = 0;
                int closed = 0;
                for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == '(') {
                                open++;
                        }
                        if (str.charAt(i) == ')') {
                                closed++;
                        }
                }
                return open == closed;
        }


        // 2. reverseInteger
        public static String reverseInteger(int a) {
                String hi = "";
                String str1 = a + "";

                for (int i = 0; i < str1.length(); i++) {
                        hi = hi + a % 10;
                        a = a / 10;
                }
                return hi;
        }

        // 3. encryptThis
        public static String encryptThis(String str) {
                StringBuilder hiStr = new StringBuilder(str);
                String[] what = hiStr.toString().split("");
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < what.length(); i++) {
                        StringBuilder stringe = new StringBuilder(what[i]);
                        char secondChar = stringe.charAt(1);
                        char lastChar = stringe.charAt(stringe.length() - 1);
                        stringe.setCharAt(1, lastChar);
                        stringe.setCharAt(stringe.length() - 1, secondChar);

                        int char1 = stringe.charAt(0);
                        stringe.deleteCharAt(0);
                        stringe.insert(0, char1);

                        result.append(stringe);
                        if (i < what.length() - 1) {
                                result.append("");
                        }
                }
                return result.toString();
        }
}


    // 4. decipherThis
 public static String decipherThis(String str){
        StringBuilder hiStr = new StringBuilder(str);
        String[] what = hiStr.toString().split("");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i<what.length; i++) {
                StringBuilder stringe = new StringBuilder(what[i]);

                String char1 = what[i].replaceAll("\\d+", "");
                int char2 = Integer.parseInt(char1);
                char char3 = (char) char2;
                what[i] = what[i].replace(char1, "" + char2);

                char secondChar = stringe.charAt(1);
                char lastChar = stringe.charAt(stringe.length() - 1);
                stringe.setCharAt(1, lastChar);
                stringe.setCharAt(stringe.length() - 1, secondChar);

                result.append(stringe);
                if (i < what.length() - 1) {
                        result.append("");
                }
                }
                return result.toString();


        }
        }

