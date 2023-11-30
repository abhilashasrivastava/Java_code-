package String;

public class ji {
    public static  void main(String[] args){
    String[] word1={"a","bhi"};
    String[] word2={"ab","hi"};
    String count1="";
    String count2="";
    for(int i=0;i<2;i++){
        count1=count1+word1[i];
    }
        for(int j=0;j<2;j++){
            count2=count2+word2[j];
        }
        if(count1==count2)
            System.out.println("true");

//    System.out.println(count1);
//        System.out.println(count2);
}}
