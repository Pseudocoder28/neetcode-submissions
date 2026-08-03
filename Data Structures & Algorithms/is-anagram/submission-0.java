class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toUpperCase();
        t=t.toUpperCase();
      int c1[]=new int[26];
      int c2[]=new int[26];
      if(s.length()!=t.length())
      return false;
      else{
        for(int i=0;i<s.length();i++){
          c1[s.charAt(i)-65]++;  
          c2[t.charAt(i)-65]++;  
        }
        for(int j=0;j<26;j++)
        if(c1[j]!=c2[j])
        return false;
      }
      return true;
    }
}
