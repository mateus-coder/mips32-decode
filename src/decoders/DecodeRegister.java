package decoders;

import java.util.*;

public class DecodeRegister {
	public String DecodeRegistersTypeR(String instruction) {

		List<String> regVariable = new ArrayList<String>();
		List<String> regValue = new ArrayList<String>();
		List<String> regValueFinal = new ArrayList<String>();

		for (int i = 0; i <= 2; i++) {
			int initialPosition = instruction.indexOf("$");
			int finalPosition = instruction.indexOf("$")+3;
			regVariable.add(i, instruction.substring(initialPosition+1,finalPosition-1));
			regValue.add(i, instruction.substring(initialPosition+2,finalPosition));
			instruction = instruction.substring(finalPosition,instruction.length());
		}

		for (int i = 0; i <= 2; i++) {
			if (regVariable.get(i).equals("t") || regVariable.get(i).equals("r")) {
				regValueFinal.add(i, Integer.toString(Integer.parseInt(regValue.get(i)) + 15));
			} else if (regVariable.get(i).equals("s")) {
				regValueFinal.add(i, regValue.get(i));
			} else if(regVariable.get(i).equals("z")) {
				regValueFinal.add(i, "0");
			}
		}

		for (int i = 0; i <= 2; i++) {
			switch (regValueFinal.get(i)) {
			case "0":
				regValue.add(i, "00000");
				break;
			case "1":
				regValue.add(i, "00001");
				break;
			case "2":
				regValue.add(i, "00010");
				break;
			case "3":
				regValue.add(i, "00011");
				break;
			case "4":
				regValue.add(i, "00100");
				break;
			case "5":
				regValue.add(i, "00101");
				break;
			case "6":
				regValue.add(i, "00110");
				break;
			case "7":
				regValue.add(i, "00111");
				break;
			case "8":
				regValue.add(i, "01000");
				break;
			case "9":
				regValue.add(i, "01001");
				break;
			case "10":
				regValue.add(i, "01010");
				break;
			case "11":
				regValue.add(i, "01011");
				break;
			case "12":
				regValue.add(i, "01100");
				break;
			case "13":
				regValue.add(i, "01101");
				break;
			case "14":
				regValue.add(i, "01110");
				break;
			case "15":
				regValue.add(i, "01111");
				break;
			case "16":
				regValue.add(i, "10000");
				break;
			case "17":
				regValue.add(i, "10001");
				break;
			case "18":
				regValue.add(i, "10010");
				break;
			case "19":
				regValue.add(i, "10011");
				break;
			case "20":
				regValue.add(i, "10100");
				break;
			case "21":
				regValue.add(i, "10101");
				break;
			case "22":
				regValue.add(i, "10110");
				break;
			case "23":
				regValue.add(i, "10111");
				break;
			case "24":
				regValue.add(i, "11000");
				break;
			case "25":
				regValue.add(i, "11001");
				break;
			case "26":
				regValue.add(i, "11010");
				break;
			case "27":
				regValue.add(i, "11011");
				break;
			case "28":
				regValue.add(i, "11100");
				break;
			case "29":
				regValue.add(i, "11101");
				break;
			case "30":
				regValue.add(i, "11110");
				break;
			case "31":
				regValue.add(i, "11111");
				break;
			}
		}
			return regValue.get(2)+" "+regValue.get(1)+" "+regValue.get(0)+" ";

	}
	public String DecodeRegistersTypeJ(String instruction) {}
	public String DecodeRegistersTypeI(String instruction) {}
}
