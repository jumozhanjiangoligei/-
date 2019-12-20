public interface computable{
    int MAx=46;
    int f(int x);
}

public class China implements Computable{
    int number;
    public int f(int x){
    int sum=0;
    for(int i=1;i<=x;i++){
        sum=sum+i;
    }
    return sum;
}
}

public class Japen implements Computable{
    int number;
    public int f(int x){
        return Max+x;
    }
}

public class Example6_1{
    public static void main(String args[]){
        China zhang;
        Japen henlu;
        zhang=new China();
        henlu=new Japen();
        zhang.number=32+Computable.MAX;
        henlu.number=14+computable.MAX;
        System.out.println("zhang的学号"+zhang.number+",zhang 求和结果"+zhang.f(100));
        System.out.println("lenhu的学号"+henlu.number"
    )
    }
}