class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();


        String  ch[]=title.split("\\s+");
        String ans="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i].length()>2)
            {
                ch[i]=Character.toUpperCase(ch[i].charAt(0)) + ch[i].substring(1);

            }

        }
        return String.join(" ",ch);

        
    }
}