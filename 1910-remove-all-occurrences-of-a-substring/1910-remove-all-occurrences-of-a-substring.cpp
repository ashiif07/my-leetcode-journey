class Solution {
public:
    string removeOccurrences(string str, string substr) {

        while(str.length() > 0 && str.find(substr) < str.length())
            str.erase(str.find(substr),substr.length());
        return str;
        
    }
};