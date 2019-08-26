package example;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tw.LuckGame;

public class LuckGameTest {
	@Test
	public void shoule_return_true_when_input_correct() {
		// given
		String input = "1234";
		LuckGame luckGame = new LuckGame();
		// when
		boolean result = luckGame.inputValid(input);
		// then
		Assertions.assertEquals(true, result);
	}
//
//	@Test
//	public void shoule_return_false_when_input_include_same_char() {
//		// given
//		String input = "1134";
//		LuckGame luckGame = new LuckGame();
//		// when
//		boolean result = luckGame.inputValid(input);
//		// then
//		Assertions.assertEquals(false, result);
//	}
//
//	@Test
//	public void shoule_return_false_when_input_short() {
//		// given
//		String input = "134";
//		LuckGame luckGame = new LuckGame();
//		// when
//		boolean result = luckGame.inputValid(input);
//		// then
//		Assertions.assertEquals(false, result);
//	}
//
//	@Test
//	public void shoule_return_false_when_input_long() {
//		// given
//		String input = "13478";
//		LuckGame luckGame = new LuckGame();
//		// when
//		boolean result = luckGame.inputValid(input);
//		// then
//		Assertions.assertEquals(false, result);
//	}
//
//	@Test
//	public void should_return_map_when_value_judge() {
//		// given
//		String input = "1348";
//		LuckGame luckGame = new LuckGame();
//		// when
//		Map<Integer, String> result = luckGame.valueJudge(input);
//		// then
//		Assertions.assertEquals("{0=1, 1=3, 2=4}", result.toString());
//	}
//	
//	@Test
//	public void should_return_String_when_position_judge() {
//		// given
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "1");
//		map.put(2, "3");
//		map.put(3, "2");
//		LuckGame luckGame = new LuckGame();
//		// when
//		String result = luckGame.positionJudge(map);
//		// then
//		Assertions.assertEquals("1A2B", result);
//	}
}
