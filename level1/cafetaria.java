// Write any import statements here

class Solution {
  
  public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
    
    long result=0; 
    long start=0;
    
    Arrays.sort(S);
    
    for(long i:S){
            
      if(i!=1)
      {
        long diff = i - 1 - start;
      
        result += (long) Math.floor(diff/(K+1)); 
        start = i+K;
      }
      
      if(i==S[M-1]){
        long diff2 = N - i;
        result += (long) Math.floor(diff2/(K+1)); 
      }
      
    }
        
    
    return result;
  }
  
}
