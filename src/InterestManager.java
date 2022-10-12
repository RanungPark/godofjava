public class InterestManager {
    public static void main(String[] args){
        InterestManager interestManager = new InterestManager();
        for(int i=1; i<=370; i+=10){
                System.out.println(interestManager.calculateAmount(i,1000000));
            }
        }

    public double getInterestRate(int day){
        double rate = 0;
        if(day>=1 && day<91){
            rate = 0.5;
        } else if (day>=91 && day<181) {
            rate = 1;
        } else if (day>=181 && day<365) {
            rate = 2;
        } else if (day>=365) {
            rate = 5.6;
        }
        return  rate;
    }
    public double calculateAmount(int day, long amount){
        double rate = getInterestRate(day);
        double interestAmount = amount*rate/100.0;
        double totalAmount = amount+interestAmount;
        return totalAmount;
    }
}
