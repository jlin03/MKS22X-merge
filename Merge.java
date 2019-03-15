import java.util.*;
public class Merge {

  public static void mergesort(int[] data) {
    int[] temp = clone(data);
    mSH(data,temp,0,data.length-1);
  }

  private static void mSH(int[] data, int[] temp, int l, int h) {
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
    mSH(data,temp,l,k);
    mSH(data,temp,k+1,h);
    merge(data,temp,left,right);
  }

  private static void merge(int[] data, int[] temp, int[] left, int[] right) {
    int t = left[0];
    int l = left[0];
    int r = right[0];
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
    if(l < left[1]) {

    }
    if(r < right[1]) {

    }


  }

  private int[] clone(int[] data) {
    int[] out = new int[data.length];
    for(int i = 0; i < out.length; i++) {
      out[i] = data[i];
    }
    return out;
  }






}
