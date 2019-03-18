import java.util.*;
public class Merge {

  public static void mergesort(int[] data) {
    int[] temp = clone(data);
    mSH(data,0,data.length-1);
  }

  private static void mSH(int[] data, int l, int h) {
    if(l >= h) {
      return;
    }
    int k = (h+l)/2;
    int[] left = new int[2];
    int[] right = new int[2];
    left[0] = l;
    left[1] = k;
    right[0] = k+1;
    right[1] = h;
    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));
    mSH(data,l,k);
    mSH(data,k+1,h);
    merge(data,left,right);
  }

  private static void merge(int[] data, int[] left, int[] right) {
    int t = left[0];
    int l = left[0];
    int r = right[0];
    int[] temp = clone(data);
    while(l <= left[1] && r <= right[1]) {
      if(data[l] < data[r]) {
        temp[t] = data[l];
        t++;
        l++;
      }
      else {
        temp[t] = data[r];
        t++;
        r++;
      }
    }
    if(l <= left[1]) {
        for(int i = l; i <= left[1];i++) {
          temp[t] = data[i];
          t++;
          l++;
        }
    }
    if(r <= right[1]) {
      for(int i = r; i <= right[1];i++) {
        temp[t] = data[i];
        t++;
        r++;
      }
    }
    data = temp;

  }

  private static int[] clone(int[] data) {
    int[] out = new int[data.length];
    for(int i = 0; i < out.length; i++) {
      out[i] = data[i];
    }
    return out;
  }


  public static void main(String[] args) {
    int[] test = {53,7,1,5,4,1,52,24,97};
    mergesort(test);
    System.out.println(Arrays.toString(test));

  }




}
