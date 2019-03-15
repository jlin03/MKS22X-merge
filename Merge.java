import java.util.*;
public class Merge {

  public static void mergesort(int[] data) {
    int[] temp = clone(data);
    mSH(data,temp,0,data.length-1);
  }

  private static void mSH(int[] data, int[] temp, int l, int h) {


  }

  private static void merge(int[] data, int[] left, int[] right) {
    return;
  }

  private int[] clone(int[] data) {
    int[] out = new int[data.length];
    for(int i = 0; i < out.length; i++) {
      out[i] = data[i];
    }
    return out;
  }






}
