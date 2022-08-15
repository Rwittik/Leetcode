/* s="MCMXCIV"
  ans=0
  V -> 5 -> (4*5)>ans -> ans=0+5=5
  I -> 1 -> (4*1)<ans -> ans=5-1=4
  C -> 100 -> (4*100)>ans -> ans=4+100=104
  X -> 10 -> (4*10)<ans -> ans=104-10=94
  M -> 1000 -> (4*1000)>ans -> ans=94+1000=1094
  C -> 100 -> (4*100)<ans -> ans=1094-100=994
  M -> 1000 -> (4*1000)>ans -> ans=994+1000=1094
      
      */
class Solution{ 
    public int romanToInt(String S){ 
        int ans = 0, num = 0;
        for (int i = S.length()-1; i >= 0; i--){
            switch(S.charAt(i)){ 
            
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}