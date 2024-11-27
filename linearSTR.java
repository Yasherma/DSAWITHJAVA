class linearSTR {
    public static void main(String[]args){
        String str="YashVerma";
        char target='V';
        System.out.println(Maybe(str, target));
    }
    static Boolean Maybe(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
            
        }
        return false;
    }

    
}
