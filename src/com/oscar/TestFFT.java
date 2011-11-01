package com.oscar;

public class TestFFT {
	public static void main(String[] args) {
		int n = 127;
		double[] real = new double[n+1];
		double[] ima = new double[n+1];
		for (int i = 0; i <= n; i++) {
			real[i] = Math.sin(2*Math.PI*100*i/n);
//			System.out.println(real[i]);
			ima[i]=0;
		}
		
		double[] result = FFT.fft(real, ima, true);
		for (double d : result) {
			System.out.println(d);
		}
	}

}
