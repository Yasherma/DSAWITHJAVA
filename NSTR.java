import java.util.Arrays;
public class NSTR {
    public static void main(String[] args){
    
        String str="YashVerma";
        char find='a';
        System.out.print(Arrays.toString(str.toCharArray()));
       
    }
    static Boolean STR(String str,char find){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==find){
                return false;
            }
        }
            }
        }
        