import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/group-anagrams/
public class groupanagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        //bmap stores pair of list of string having a particular character count
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            //freq is a frequency map that stores character count in each string
            HashMap<Character,Integer> freq=new HashMap<>();

            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                freq.put(ch,freq.getOrDefault(ch,0)+1);
            }

            if(bmap.containsKey(freq)){
                ArrayList<String> temp=bmap.get(freq);
                temp.add(s);
                bmap.put(freq,temp);
            }
            else{
                ArrayList<String>temp=new ArrayList<>();
                temp.add(s);
                bmap.put(freq,temp); 
            }
           
        }
    // System.out.println(bmap);
        for(HashMap<Character,Integer> map:bmap.keySet()){
            ans.add(bmap.get(map));
        }
        return ans;
}
}
