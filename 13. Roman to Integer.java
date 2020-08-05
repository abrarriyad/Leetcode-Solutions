class Solution {
    public int romanToInt(String s) {
        int num=0;
        char s1 = ' ';
        char s2 = ' ';
        for(int i=0; i<s.length(); i++){
             s1 = s.charAt(i);
            if(i<s.length()-1)
             s2 = s.charAt(i+1);
            
            if(s1=='I'){
                if(s2=='V'){
                    num+=4;
                    i++;
                }
                else if(s2=='X'){
                    num+=9;
                    i++;
                }
               else
                   num++;    
            }
                
            else if(s1=='V')
                num+=5;
            
            else if(s1=='X'){
                 if(s2=='L'){
                    num+=40;
                    i++;
                }
                else if(s2=='C'){
                    num+=90;
                    i++;
                }
                else
                    num+=10;
            }
                
            else if(s1=='L')
                num+=50;
            
            else if(s1=='C'){
                 if(s2=='D'){
                    num+=400;
                    i++;
                }
                else if(s2=='M'){
                    num+=900;
                    i++;
                }
                else
                    num+=100;
            }
                
            else if (s1=='D')
                num+=500;
            else if(s1=='M')
                num+=1000;
            
        }
        return num;
    }
}