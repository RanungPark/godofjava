public class ManageHeight {
    int [][] gradeHeights;
    public static void main(String[] args) {
        ManageHeight height = new ManageHeight();
        height.setData();
        int twoDimLength = height.gradeHeights.length;
        for(int oneLoop=0; oneLoop<twoDimLength; oneLoop++){
            height.printHeight(oneLoop);
        }
        int loop = 0;
        while (loop != twoDimLength){
            height.printAverage(loop);
            loop++;
        }
    }
    public void setData(){
        gradeHeights = new int[5][];
        gradeHeights[0]=new int[] {170,180,174,175,177};
        gradeHeights[1]=new int[] {160,165,167,186};
        gradeHeights[2]=new int[] {158,177,187,176};
        gradeHeights[3]=new int[] {173,182,181};
        gradeHeights[4]=new int[] {170,180,165,177,172};

    }
    public void printHeight(int classNo) {
        System.out.println("Class No.:"+(classNo+1));
        int twoDim1Length = gradeHeights[classNo].length;
        for (int twoLoop=0; twoLoop<twoDim1Length; twoLoop++){
            System.out.println(gradeHeights[classNo][twoLoop]);
        }
    }

    public void printAverage(int classNo){
        System.out.println("Class No.:"+(classNo+1));
        double heightAverage= 0.0;
        int twoDim1Length = gradeHeights[classNo].length;
        for(int twoLoop=0; twoLoop<twoDim1Length; twoLoop++){
            heightAverage=heightAverage+gradeHeights[classNo][twoLoop];
        }
        heightAverage=heightAverage/twoDim1Length;
        System.out.println("Height average:"+heightAverage);
    }
}
