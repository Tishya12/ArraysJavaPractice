package producer_consumer_problem;

public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                this.c.producer_item(i);
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
