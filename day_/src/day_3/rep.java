package day_3;

	import java.util.LinkedHashMap;
	import java.util.Map;

	public class rep {

	    public static Character findFirstNonRepeatingChar(String str) {
	        if (str == null || str.isEmpty()) {
	            return null;
	        }

	        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

	        // Count occurrences of each character
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Find the first character with count 1
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }

	        // All characters are repeating
	        return null;
	    }

	    public static void main(String[] args) {
	        String input = "swiss";
	        Character result = findFirstNonRepeatingChar(input);

	        if (result != null) {
	            System.out.println("First non-repeating character: " + result);
	        } else {
	            System.out.println("All characters repeat. Result: null");
	        }
	    }
	}


