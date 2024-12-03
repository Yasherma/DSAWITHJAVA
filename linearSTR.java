class linearSTR {
    public static void main(String[]args){
        String str="YashVerma";
        char target='s';
        System.out.println(Maybe(str, target));
    }
    static int Maybe(String str,char target){
        if(str.length()==0){
            return -1;
        }
        for(int i=0;i<str.length()-1;i++){
            if(target==str.charAt(i)){
                return i;
            }
            
        }
        return -1;
    }

    
}
