public class Solution {
    public bool IsPalindrome(string s) {
        string newst="";
        for(int i=0; i< s.Length; i++){
            if(char.IsLetterOrDigit(s[i]))
               newst += char.ToLower(s[i]);
        }
//         var sb = new StringBuilder();
//          foreach (char c in s){
//            if (char.IsLetterOrDigit(c))
//              sb.Append(char.ToLower(c));
// }
//         string newst = sb.ToString();

        int start=0, end=newst.Length-1;
        while(start < end){
            if(newst[start]== newst[end]){
                start++;
                end--;

            }
            else break;
        }
        if(start==end||start==(end+1))
            return true;
        else
           return false;

            
            
            

        
    
    }
}
