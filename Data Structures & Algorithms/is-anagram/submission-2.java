class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer>table=new HashMap();
    for(int i=0;i<s.length();i++){
       table.put(s.charAt(i),table.getOrDefault(s.charAt(i),0)+1);
      }
       

for(int i=0;i<t.length();i++){

        table.put(t.charAt(i),table.getOrDefault(t.charAt(i),0)-1);
    
}
for(Map.Entry<Character,Integer>entry:table.entrySet()){
if(entry.getValue()!=0)
return false;
}
return true;

    }
}
