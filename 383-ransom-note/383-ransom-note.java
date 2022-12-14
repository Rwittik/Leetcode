// class Solution{
//      public boolean canConstruct(String ransomNote, String magazine) {
//         Map<Character, Integer> magM = new HashMap<>();
//         for (char c:magazine.toCharArray()){
//             int newCount = magM.getOrDefault(c, 0)+1;
//             magM.put(c, newCount);
//         }
//         for (char c:ransomNote.toCharArray()){
//             int newCount = magM.getOrDefault(c,0)-1;
//             if (newCount<0)
//                 return false;
//             magM.put(c, newCount);
//         }
//         return true;
//     }
// }
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }

        return true;
    }
}
