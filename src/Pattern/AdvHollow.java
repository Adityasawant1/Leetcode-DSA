package Pattern;

public class AdvHollow {
    public static void main(String args[]){

        int n=5,totalRow=3,totalColumn=4;
        for(int i=1;i<=totalRow;i++){
            for(int j=1;j<=totalColumn;j++){
                if(i==1 || i==totalRow || j==1 || j==totalColumn){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

}
