class Tree{
    //dodatkowy konstruktor, żeby było czytelniej
    public Tree(Tree l, Tree r){
        this.l = l;
        this.r = r;
    }
    
    public int x;
    public Tree l;
    public Tree r;
    
    @SuppressWarnings("empty-statement")
    public int solution(int N) {
        int pow=1;
        while ((pow *= 2) < N);
        while (N%(pow /= 2) != 0);
        return pow;
    }
}


