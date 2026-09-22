class Solution {
public:
        set<vector<int>>s;
        void helper(vector<int>&arr,int idx, int tar,vector<vector<int>>&ans, vector<int>&comb){
            
            if(idx==arr.size() || tar<0) return;

            if(tar==0){
                if(s.find(comb)==s.end()){
                    ans.push_back({comb});
                    s.insert(comb);
                }
                return;
            }

            comb.push_back(arr[idx]);
            
            //single
            helper(arr,idx+1,tar-arr[idx],ans,comb);\
            
            //multiple
            helper(arr,idx,tar-arr[idx],ans,comb);

            comb.pop_back();
            //Execution
            helper(arr,idx+1,tar,ans,comb);

        }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {

        vector<int>combination;
        vector<vector<int>>ans;

        helper(candidates,0,target,ans,combination);

        return ans;
    }
};