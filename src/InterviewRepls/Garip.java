package InterviewRepls;

class Garip {
    public static void main(String[] args) {
        int[] array = arraySumToZero(2);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static int[] arraySumToZero(int N) {
        int[] array = new int[N];
        int border=0;
        if(N%2==0)
            border=N/2;
        else
            border=(N-1)/2;

        for(int i=0; i<border; i++){
            array[i]=N-(i+1);
            }
        for(int i=border; i<N; i++){
            array[i]=-array[array.length-(i+1)];
        }
        return array;
    }
}

//System.out.println("input "+ '"' + input + '"' +" -> " +isBalanced(input));