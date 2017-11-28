package Arrays;

public class PrintMatrixDiagonal {


    public static void main(String[] args) {
        int[][] a=new int[4][5];
        a[0][0]=1;a[0][1]=2;a[0][2]=3;a[0][3]=4;a[0][4]=5;
        a[1][0]=6;a[1][1]=7;a[1][2]=8;a[1][3]=9;a[1][4]=10;
        a[2][0]=11;a[2][1]=12;a[2][2]=13;a[2][3]=14;a[2][4]=15;
        a[3][0]=16;a[3][1]=17;a[3][2]=18;a[3][3]=19;a[3][4]=20;
//        a[4][0]=20;a[4][1]=21;a[4][2]=22;a[4][3]=23;a[4][4]=24;
        int m=4;
        int n=5;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
        }
    }

    //print diagonal elements

        for(int i=0;i<m;i++){
        System.out.println();
        int x=i;
        int y=0;
        while(x>=0){
            System.out.print(" "+a[x][y]);
            x=x-1;
            y=y+1;

        }

        }

        for(int i=1;i<n;i++){
            System.out.println();
            int x=m-1;
            int y=i;
            while(y<=4){
                System.out.print(" "+a[x][y]);
                x=x-1;
                y=y+1;

            }

        }
    }
}
