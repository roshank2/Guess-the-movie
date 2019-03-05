public class GuessTheMovie{

    private char[] newTmp;

    public void setNewTmp(char[] newTmp){
        this.newTmp=newTmp;
    }

    public String printBlankSpace(String randomMovie, String tmp){
        for(int i=0;i<randomMovie.length();i++){
            if(randomMovie.charAt(i)==' '){
                tmp+=' ';
                continue;
            }
            else {
                tmp+='_';
            }
        }
        System.out.println("\n\t" + tmp);
        return tmp;
    }

    public int printChars(String randomMovie, char[] wrongChar,int m,char ch,int k){
        boolean found = false;
        for(int i=0;i<randomMovie.length();i++){
            if(i<3&&wrongChar[i]==ch) {
                System.out.println("\nWrong Character, Already Guessed");
                return k;
            }
            else if(randomMovie.toLowerCase().charAt(i)==ch){
                newTmp[i]=randomMovie.charAt(i);
                found = true;
            }
        }
        System.out.print("\n\t");
        System.out.println(newTmp);
        if(!found){
            k--;
            wrongChar[m]=ch;
            m++;
        }
        return k;
    }
}
