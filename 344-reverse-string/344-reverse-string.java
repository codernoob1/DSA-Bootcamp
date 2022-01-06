class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    void reverse(char[] s,int start,int end){
        if (start>=end){
            return ;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s,start+1,end-1);
    }
}

//alternative use only one pointer
class Solution {
    public void reverseString(char[] s) {
        reverse(s,0);
    }
    void reverse(char[] s,int start){
        if (start>=s.length/2){
            return ;
        }
        char temp = s[start];
        s[start] = s[s.length-start-1];
        s[s.length-start-1] = temp;
        reverse(s,start+1);
    }
}
