package Practiveproblem;

public class Secondlar {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,8};
        int firstlar=arr[0];
        int Secondlar=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > firstlar)
            {
                Secondlar=firstlar;
                firstlar=arr[i];
            }
            else if((arr[i]<firstlar) && (arr[i]>Secondlar))
            {
                Secondlar=arr[i];
            }
        }
        //System.out.println(firstlar);
        System.out.println(Secondlar);
    }
}
