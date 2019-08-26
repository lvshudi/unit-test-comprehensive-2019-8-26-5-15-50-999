package tw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class LuckGame {
	// 游戏答案
	private static String answer = "1234";
	private String[] answers = answer.split("");

	// 整合
	public String runGame(String input) {
		if (inputValid(input)) {
			String[] result = positionJudge(valueJudge(input));
			resultFormat(result);
			return result[0];
		} else {
			System.out.println("输入错误");
			return "输入错误";
		}
	}

	// 验证输入是否合法
	public boolean inputValid(String input) {
		String[] inputs = input.split(" ");
		if (inputs.length != 4) {
			return false;
		} else {
			for (int i = 0; i < inputs.length; i++) {
				for (int j = i + 1; j < inputs.length; j++) {
					if (inputs[i].equals(inputs[j])) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public Map<Integer, String> valueJudge(String input) {
		String[] inputs = input.split(" ");

		Map map = new HashMap<Integer, String>();
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < inputs.length; j++) {
				if (inputs[j].equals(answers[i])) {
					map.put(j, inputs[j]);
				}
			}
		}
		return map;
	}

	public String[] positionJudge(Map<Integer, String> map) {
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		int countA = 0;
		int countB = 0;
		String[] result = new String[3];
		String errorNumber = "";
		String correctNumber = "";
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			int position = entry.getKey();
			if (answers[position].equals(entry.getValue())) {
				correctNumber += entry.getValue();
				countA++;
				continue;
			}
			errorNumber += entry.getValue();
			countB++;
		}
		result[0] = countA + "A" + countB + "B";
		result[1] = errorNumber;
		result[2] = correctNumber;
		return result;
	}

	// resultFormat
	public void resultFormat(String[] result) {
		String[] results = result[0].split("");
		String[] falsePrompt = result[1].split("");
		String[] correctPrompt = result[2].split("");
		String falseOutPut = "";
		String correctOutput = "";
		if (results[0].equals("4")) {
			System.out.println(result[0] + " 胜利，一切正确");
		} else if (results[0].equals("0") && results[2].equals("0")) {
			System.out.println(result[0] + "都错了");
		} else {
			for (String string : falsePrompt) {
				falseOutPut += ","+string;
			}
			for (String string : correctPrompt) {
				correctOutput += "," + string;
			}
			System.out.println(result[0] + " " + correctOutput + "正确" + falseOutPut + "位置错误");
		}

	}
}
