public class babu{
    public static void main(String[] args) {
        int seconds[]={66,57,54,53,64,50,59};
        int n=seconds.length;
        int temp= 0;
     
            for(int i=0;i<n;i++){
                for(int j=1;j<(n-i);j++){
                    if(seconds[j-1]>seconds[j]){
                        temp=seconds[j-1];
                          seconds[j-1]=seconds[j];
                          seconds[j]=temp;
            }    
           }
            }
            
        
            
        
        
        System.out.println("best time"+seconds[0]+"seconds");
        }      
}