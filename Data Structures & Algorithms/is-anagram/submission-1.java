class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }
        for(char ch : t.toCharArray()){
            if(frequencyMap.containsKey(ch) && frequencyMap.get(ch)!=0){
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
