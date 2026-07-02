class Solution {
    public int[][] generateMatrix(int n) {
        int [][]a=new int[n][n];
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int num=1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                a[top][i]=num++;
            }
            top++;
            for(int j=top;j<=bottom;j++)
            {
                a[j][right]=num++;
            }
            right--;
            if(top<=bottom)
            {
                for(int p=right;p>=left;p--)
                {
                    a[bottom][p]=num++;
                }
            }
            bottom--;
            if(left<=right)
            {
                for(int q=bottom;q>=top;q--)
                {
                    a[q][left]=num++;
                }
            }
            left++;
        }
        return a;
    }
}