public class SinkNode
{
    public static void main(String[] args)
    {
        int sinknode[][] = {{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
        // sinknode[0][0] = 0;
        // sinknode[0][1] = 1;
        // sinknode[0][2] = 1;
        // sinknode[0][3] = 0;
        // sinknode[0][4] = 1;

        // sinknode[1][0] = 0;
        // sinknode[1][1] = 0;
        // sinknode[1][2] = 0;
        // sinknode[1][3] = 1;
        // sinknode[1][4] = 0;

        // sinknode[2][0] = 0;
        // sinknode[2][1] = 0;
        // sinknode[2][2] = 0;
        // sinknode[2][3] = 1;
        // sinknode[2][4] = 1;

        // sinknode[3][0] = 0;
        // sinknode[3][1] = 0;
        // sinknode[3][2] = 0;
        // sinknode[3][3] = 0;
        // sinknode[3][4] = 0;

        // sinknode[4][0] = 0;
        // sinknode[4][1] = 0;
        // sinknode[4][2] = 0;
        // sinknode[4][3] = 0;
        // sinknode[4][4] = 0;

        int total_sink = 0;
        int n = sinknode.length;
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(sinknode[i][j] == 0)
                {
                    count++;
                }
                if(count == n) 
                {
                    System.out.println("Sink Node : " +(char)(65+i));
                    total_sink++;
                }
            }
        }
            System.out.println("Total sink nodes : "+total_sink);
    }
}