package hillel.plyska.lesson;

public class Main {
    public static void main(String[] args) {
        int [] a = new int[10];
        for (int b =0; b< a.length; b++ ){
            a[b] = b+1;
        }
        for (int c=0;c<a.length;c++){
            System.out.print(a[c]+ " ");
            if (a[c]%5==0){
                System.out.println();
            }
        }
    }
}
