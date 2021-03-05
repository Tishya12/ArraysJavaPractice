package producer_consumer_problem;

public class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c=c;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                this.c.consumer_item();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
