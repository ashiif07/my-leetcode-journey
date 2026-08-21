class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;

       /*  List<Boolean> list = new ArrayList<>(Collections.nCopies(n+1,true)); */

       boolean[] isPrime= new boolean[n];
       for(int i=2;i<n;i++) isPrime[i]=true;


        for(int i=2; i*i<n; i++){
            
            if(isPrime[i]){
                for(long j=(long)i*i;j<n;j+=i){
                   isPrime[(int)j]=false;
                }
            }
        }
        int count =0;
        for(int i=2;i<n;i++){
            if(isPrime[i]) count++;
        }
        
        return count;    
    }
}