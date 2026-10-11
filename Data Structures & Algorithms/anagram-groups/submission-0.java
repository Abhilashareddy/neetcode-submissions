class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>>result=new HashMap();
    for(String s:strs){
      char[] charArray =s.toCharArray();
      Arrays.sort(charArray);
      String sortedArray= new String(charArray);
      result.putIfAbsent(sortedArray,new ArrayList());
      result.get(sortedArray).add(s);
    }
    return new ArrayList<>(result.values());

    }
}
