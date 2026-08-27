class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        char[] mp = new char[26], temp = new char[26];

        for(char c : s1.toCharArray()) mp[c - 'a']++;

        int left = 0, right = 0;

        for(right = 0; right < s1.length(); right++)
            temp[s2.charAt(right) - 'a']++;

        if(Arrays.equals(mp, temp)) return true;

        while(right < s2.length()) {
            temp[s2.charAt(right) - 'a']++;
            temp[s2.charAt(left) - 'a']--;

            left++;
            right++;

            if(Arrays.equals(mp, temp)) return true;
        }

        return false;
    }
}