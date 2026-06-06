class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int cols=0;
        int cole=matrix[0].length-1;
        int rows=0;
        int rowe=matrix.length-1;
List<Integer>l=new ArrayList<>();

        while(rows<=rowe && cols<=cole)
        {
            for(int i=cols;i<=cole;i++)
            {
l.add(matrix[rows][i]);
            }
            rows++;
            for(int j=rows;j<=rowe;j++)
            {
                l.add(matrix[j][cole]);
            }
            cole--;

            if(rows<=rowe)
            {
                for(int p=cole;p>=cols;p--)
                {
                    l.add(matrix[rowe][p]);
                }
            }
            rowe--;
            if(cols<=cole)
            {
                for(int q=rowe;q>=rows;q--)
                {
                    l.add(matrix[q][cols]);
                }
            }
            cols++;
        }

        return l;
    }
}