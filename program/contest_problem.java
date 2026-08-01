class Solution {
    public int countValidPrefixes(String s) {

        int zero = 0;
        int one = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }

            if (Math.abs(zero - one) <= 1) {
                ans++;
            }
        }

        return ans;
    }
}


// output:
Prefix "1"
0 = 0, 1 = 1
diff = 1
Valid

Prefix "10"
0 = 1, 1 = 1
diff = 0
Valid

Prefix "101"
0 = 1, 1 = 2
diff = 1
Valid

Answer = 3
