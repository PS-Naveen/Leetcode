class Solution {
    public String capitalizeTitle(String title) {
        String[] sh = title.split(" ");
        String s = "";
        for(int i = 0 ; i < sh.length ; i++) {
            String str = sh[i];
            String word = "";
            for(int j = 0 ; j < str.length() ; j++){
                int ch = (int) str.charAt(j);
                if(str.length() > 2){
                    if(ch >= 97 && ch <= 122 && j==0){
                        ch -= 32;
                        word += (char)ch;
                    } else if(ch >= 65 && ch <= 90 && j!=0){
                        ch += 32;
                        word += (char)ch;
                    } else {
                        word += (char)ch;
                    }
                } else {
                    if(ch >= 65 && ch <= 90){
                        ch += 32;
                        word += (char)ch;
                    } else {
                        word += (char)ch;
                    }
                }
                
            }
            s+=word;
            s+=" ";
        }
        return s.trim();
    }
}