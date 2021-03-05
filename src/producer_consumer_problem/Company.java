package producer_consumer_problem;

public class Company {
    int n;
    boolean f=false;
    //f=false ...chance:producer
    //f=true ...chance:consumer
    synchronized public void producer_item(int n) throws Exception{
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("produced: "+this.n);
        f=true;
        notify();   //informing consumer thread(inter-thread communication)
    }


    synchronized public int consumer_item() throws Exception{
        if(!f){
            wait();
        }

        System.out.println("consumed: "+this.n);
        f=false;
        notify();
       return this.n;
    }

}
