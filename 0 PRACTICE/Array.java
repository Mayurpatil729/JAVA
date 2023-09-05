class Array{
    public static void main(String[] args) {
        int[] arr1=new int[5];
        int[][] arr2={
            {10,20,30,40,50},
            {11,22,33,44,55}

        };
        arr1[0]=5;
        arr1[1]=4;
        arr1[2]=3;
        arr1[3]=2;
        arr1[4]=1;
    for(int i=0;i<=arr1.length;i++){
        System.out.println(arr1[i]+" ");

    }
    System.out.println("\n++++++++++++++++++++++++++");
    arr2[1][4]=60;
    System.out.println(arr2[1][4]);
        for(int[] num:arr2){
            System.out.println(value+" ");

        }
        System.out.println();
    }
}

