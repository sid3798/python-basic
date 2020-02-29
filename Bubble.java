public class Bubble{
    public static void main(String[] args) {
        int sec[]={66,57,54,53,64,52,59};
        int n=seconds.length;
        int temp= 0;
        for(int i=0;i<n;i++)
        for(int j=1;j<(n-1);j++){
            if(seconds[j-1]>seconds[j]){
                temp=seconds[j-1];
                seconds[j-1]=seconds[j];
                seconds[j]=temp;
            }
        }
        System.out.print("best time"+seconds[0]+"seconds");
        }
        
}