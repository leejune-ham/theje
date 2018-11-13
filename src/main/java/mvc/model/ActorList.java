package mvc.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ActorList {

	HashMap<String, List<String>> map;
	
	public ActorList() {
		map = new HashMap<>();
		map.put("male", Arrays.asList("장동건,장서건,장남건".split(",")));
		map.put("female", Arrays.asList("한가인,한나인,한다인".split(",")));
		map.put("it", Arrays.asList("빌게이츠,빌게이추,빌리".split(",")));
	}
	
	public List<String> actors(String key) {
		return map.get(key);
	}
	
}
