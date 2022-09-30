// Write any import statements here

class Solution {
  
  public int getArtisticPhotographCount(int N, String C, int X, int Y) {
    
    int result = 0;
    char[] Cs = C.toCharArray();
    int lim = N-X;
    
    for(int i=0; i<lim; i++)
    {
      
      if(Cs[i] == 'P' || Cs[i] == 'B')
      {
        for(int j = i+X; j<=i+Y; j++)
        {
          if(j<N && Cs[j]=='A')
          {      
            for(int k=X; k<=Y; k++)
            {
              int x = j+k;
              if(x>=N) break;
             
              if(Cs[x] == 'P' || Cs[x]=='B')
              {
                if(Cs[x] != Cs[i]){
                  result++;
                }
              }
            }
          }
        }
      }
      
    }
    
    return result;
  }
  
}
