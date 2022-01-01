//https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/

public class overlapping_rectangles{
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        //This condition checks if a rectangle is on the left side of another rectangle
        if(L1[0]>R2[0]||L2[0]>R1[0]){
            return 0;
        }
        //This condition checks if a rectangle is above one rectangle or not
        if(L1[1]<R2[1]||L2[1]<R1[1]){
            return 0;
        }
        return 1;
    }
};