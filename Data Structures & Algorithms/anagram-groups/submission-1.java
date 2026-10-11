class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> table=new HashMap<>();
        for(String s:strs){
            char[] firstStr=s.toCharArray();
            Arrays.sort(firstStr);
            String sortedStr=new String(firstStr);
            table.putIfAbsent(sortedStr,new ArrayList());
            table.get(sortedStr).add(s);
        
        }
        return new ArrayList(table.values());
    }
}
