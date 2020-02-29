public class Dog{
    public static void main(String[] args) {
        int total=400;
        int percont=8;
        int totalcont=0;
        int temp =total+percont;

        while(temp>percont){
            temp=temp-percont;
            totalcont--;
        }
        System.out.print("jack buy"+totalcont+"container");
    }
}