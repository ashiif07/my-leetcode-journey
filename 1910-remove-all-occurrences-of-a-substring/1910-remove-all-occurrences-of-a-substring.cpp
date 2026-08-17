class Solution {
public:
    string removeOccurrences(string str, string substr) {


        /*  .length() -> find the current string length
            .find() -> return first occurance index, if not found return a garbage value
            . erase(st,end) -> erase a substring,  where 's' = starting index and
             'end' = total number of character  */

        while(str.length() > 0 && str.find(substr) < str.length())
            str.erase(str.find(substr),substr.length());
        return str;
        
    }
};