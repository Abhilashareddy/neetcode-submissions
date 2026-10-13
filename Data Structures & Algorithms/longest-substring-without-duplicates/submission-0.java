class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, n = s.length();
        int max = 0;
        HashSet<Character> set = new HashSet();
        while (r < n) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            
                set.add(s.charAt(r));
                max = Math.max(max, (r - l + 1));
                r++;
            
        }
        return max;
    }
}
