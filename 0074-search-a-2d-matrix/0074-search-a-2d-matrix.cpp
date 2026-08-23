class Solution {
public:

    bool searchRow(vector<vector<int>>& matrix, int target,int row){

        int col=matrix[0].size();
        int st=0,end=col-1;

        while(st<=end){
            int mid = st+(end-st)/2;
            if(target==matrix[row][mid]) 
            return true;
            else if(target > matrix[row][mid]) 
            st=mid+1;
            else 
            end=mid-1;
        }
        return false;
    }
                                            
    bool searchMatrix(vector<vector<int>>& matrix, int target) {

        int row=matrix.size(),col=matrix[0].size();
        int st=0,end=row-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(target>=matrix[mid][0] && target<=matrix[mid][col-1]){
                 return searchRow(matrix,target,mid);
                 }

            else if (target>matrix[mid][col-1])
                 st=mid+1;

            else
                 end=mid-1;
        }
        return false;        
    }
};