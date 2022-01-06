public void reverseString(char[] s) {
int strLen=s.length;
reverse(s,0,strLen-1);
}
void reverse(char[]s, int start ,int end){
if(start>=end){
return;
}
char ch=s[start];
s[start]=s[end];
s[end]=ch;
reverse(s,start+1,end-1);
}