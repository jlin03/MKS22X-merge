import java.util.*;
public class Merge {

  public static void mergesort(int[] data) {
    mSH(data,0,data.length-1);

  }

  private static void mSH(int[] data, int l, int h) {
    if(h - l < 2) {
      insert(data,l,h);
      return;
    }
    int k = (h+l)/2;
    int[] left = new int[2];
    int[] right = new int[2];
    left[0] = l;
    left[1] = k;
    right[0] = k+1;
    right[1] = h;
    mSH(data,l,k);
    mSH(data,k+1,h);
	  merge(data,left,right);
  }

  private static void merge(int[] data, int[] left, int[] right) {
    int t = 0;
    int l = left[0];
    int r = right[0];
    int[] temp = new int[right[1]-left[0]+1];
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
    for(int i = left[0]; i <= right[1];i++) {
		data[i] = temp[i-left[0]];
	}

  }

  public static void insert(int[] data, int l, int h) {
    for(int i = l; i <= h; i++) {
      for(int b = i; b > l; b--) {
        if(data[b] < data[b-1]) {
          int temp = data[b];
          data[b] = data[b-1];
          data[b-1] = temp;
        }
      }
    }
  }

  private static int[] clone(int[] data) {
    int[] out = new int[data.length];
    for(int i = 0; i < out.length; i++) {
      out[i] = data[i];
    }
    return out;
  }







}
