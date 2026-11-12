class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String cle = new String(chars);
            if(map.containsKey(cle)){
                map.get(cle).add(s);
            }
            else{
                List<String> nouvelleListe = new ArrayList<>();
                nouvelleListe.add(s);
                map.put(cle, nouvelleListe);
            }
        }
    return new ArrayList<>(map.values());
    }
}
