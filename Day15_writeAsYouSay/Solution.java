package Day15_writeAsYouSay;

public class Solution 
{
    public static String writeAsYouSpeak(int n) 
    {
        String ans = "1";
        for(int i = 1; i < n; i++){
            ans = countSay(ans);
        }
        return ans;
    }
    public static String countSay(String str){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char ch = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(ch);
                ch = str.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(ch);
        return sb.toString();
    }
}