package nl.hu.iac.service;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TrackServiceImpl {
	public TrackServiceImpl() {
	}
	public String getMean(String list) {
		String[] array = list.split("\\s+",-1);
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (isInteger(array[i])){
				sum += Double.parseDouble(array[i]);
			} else {
				return "Zorg ervoor dat er een lijst met nummers wordt gegeven die gesplitst zijn door spaties.";
			}
		}
		String mean = Double.toString(sum / array.length);
		return mean;
	}
	public String getVariance(String list) {
		double mean = Double.parseDouble(getMean(list));
		String[] array = list.split("\\s+",-1);
		double variance = 0;
		for (int i = 0; i < array.length; i++) {
			variance += Math.pow(Double.parseDouble(array[i]) - mean, 2);
		}
		return Double.toString(variance);
	}
	public String getStd(String list) {
		String[] array = list.split("\\s+",-1);
		Double result = Math.sqrt(Double.parseDouble(getVariance(list)) / array.length);
		return Double.toString(result);
	}
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e) {
			return false;
		} catch(NullPointerException e) {
			return false;
		}
		return true;
	}

}
