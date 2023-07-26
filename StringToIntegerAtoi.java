public class StringToIntegerAtoi {
    public static int myAtoi(String s) {
        s = s.trim();
        int answer = 0;
        boolean negative = false;

        if (s.length() == 0) {
            return answer;
        }

        char[] splitS = s.toCharArray();

        int index = 0;
        if (splitS[0] == '-' || splitS[0] == '+') {
            if (splitS[0] == '-') {
                negative = true;
            }
            index++;
        }

        while (index < splitS.length && Character.isDigit(splitS[index])) {
            int num = Character.getNumericValue(splitS[index]);

            if (Integer.MAX_VALUE / 10 < answer || (Integer.MAX_VALUE / 10 == answer && Integer.MAX_VALUE % 10 < num)) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            answer = answer * 10 + num;
            index++;
        }

        return negative ? -answer : answer;
    }


    public static void main(String[] args) {
        String r = "words and 987";
        System.out.println(myAtoi(r));

        String t = "-884 words and 987";
        System.out.println(myAtoi(t));

        String q = "                      ";
        System.out.println(myAtoi(q));
        String s = "42";
        System.out.println(myAtoi(s));

        String d = "   -42";
        System.out.println(myAtoi(d));

        String e = "4193 with words";
        System.out.println(myAtoi(e));

        String j = "   +22d2";
        System.out.println(myAtoi(j));

        String m = "-5896547125588453662";
        System.out.println(myAtoi(m));

        String k = "-";
        System.out.println(myAtoi(k));

        String y = "-20000000000000000000";
        System.out.println(myAtoi(y));
    }
}