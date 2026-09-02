class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {

        int n =nums.size();
        int count=0;
        vector<int> preSum(n,0);

        preSum[0] = nums[0];

        for(int i=1;i<n;i++){
            preSum[i]=nums[i]+preSum[i-1];
        }

        unordered_map<int,int>map;

        for(int i=0;i<n;i++){

            if(preSum[i]==k) count++;

            int val = preSum[i]-k;

            if(map.find(val) != map.end()) count+=map[val];

            if(map.find(preSum[i])== map.end()) map[preSum[i]] = 0;

            map[preSum[i]]++;
        }
        return count;        
    }
};