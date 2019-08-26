package tw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class LuckGame {
	// 游戏答案
	private static String answer = "1234";
	private String[] answers = answer.split("");

//	public String runGame(String input) {
//		if (inputValid(input)) {
//			String result = positionJudge(valueJudge(input));
//			return result;
//		} else {
//			return "输入错误";
//		}
//	}
	
	// 验证输入是否合法
	public boolean inputValid(String input) {
		String[] inputs = input.split("");
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
		String[] inputs = input.split("");

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

	public String positionJudge(Map<Integer, String> map) {
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		int countA = 0;
		int countB = 0;
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			int position = entry.getKey();
			if (answers[position].equals(entry.getValue())) {
				countA++;
				continue;
			}
			countB++;
		}

		return countA + "A" + countB + "B";
	}
}
