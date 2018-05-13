public class DiscreteAlgorithms {

    private int C[];
    private int P[];
    private boolean PR[];
    private int n;
    private int i;
    private int k;
    private int x;
    private int y;

    public DiscreteAlgorithms(int n){
        this.n = n;
        C = new int[n+1];
        P = new int[n+1];
        PR = new boolean[n+1];
    }

    public void mathAlgo_1_12() {
        for(i=1; i<=n; i++){
            P[i]=i;
            C[i]=1;
            PR[i] = true;
        }
        C[n]=0;
        write();
        i=1;
        while(i<n){
            i=1;
            x=0;
            while(C[i]==n-i+1){
                PR[i]=!PR[i];
                C[i]=1;
                if(PR[i]) x++;
                i++;
            }
            if(i<n){
                if(PR[i]) k=C[i]+x;
                else k=n-i+1-C[i]+x;
                y=P[k];
                P[k]=P[k+1];
                P[k+1]=y;
                write();
                C[i]++;
            }
        }
    }

    public void write(){
        for(int a=1; a<=n; a++){
            System.out.print(P[a]+", ");
        }
        System.out.print("\n\n");
    }
}
