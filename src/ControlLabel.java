public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
    }

    public void  printTimesTable(){
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(j==4)break;
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
