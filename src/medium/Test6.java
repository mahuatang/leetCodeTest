package medium;

public class Test6 {
    public static void main(String[] args) {
        convert("LEETCODEISHIRINGA", 4);
     //   convert("ABC", 2);
    }

    public static String convert(String s, int numRows) {
        int length = s.length();
        if(length <= numRows || numRows == 1) {
            return s;
        }
        int i = 0;
        int size = getNumber(length, numRows);
        String[] result = new String[size + 1];
        for (int m = 0; m < length; m += numRows - 1) {
            if (m + numRows > length) {
                break;
            }
            String str = s.substring(m, m + numRows);
            result[m / (numRows - 1)] = str;
        }
        if (numRows + (numRows - 1) * (size - 1) < length) {
            result[size] = s.substring(numRows + (numRows - 1) * (size - 1) - 1, length);
            int flag = result[size].length();
            while (flag < numRows) {
                result[size] += " ";
                flag++;
            }
        } else {
            int flag = 0;
            result[size] = s.substring(s.length() - 1, s.length());
            while (flag < numRows) {
                result[size] += " ";
                flag++;
            }
        }
        String date = "";
        for (int m = 0; m < numRows; m++) {
            for (int n = 0; n < result.length; n++) {
                if (m == 0 || m == numRows - 1) {
                    if (n % 2 == 0) {
                        date += result[n].substring(m, m + 1).trim();
                    }
                } else {
                    if (n % 2 == 0) {
                        date += result[n].substring(m, m + 1).trim();
                    } else {
                        date += result[n].substring(numRows - m - 1, numRows - m).trim();
                    }
                }
            }
        }

        return date;
    }

    public static int getNumber(int length, int numRows) {
        return (length - numRows) / (numRows - 1) + 1;
    }
}
