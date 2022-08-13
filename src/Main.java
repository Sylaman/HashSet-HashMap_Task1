import java.util.*;

public class Main {

    public static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
            "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < loremIpsum.length(); i++) {
            char ch = loremIpsum.charAt(i);
            if (ch == ' ' || ch == ',') {
                continue;
            }
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int tempValue = map.get(ch) + 1;
                map.put(ch, tempValue);
            }
        }
        int max = Collections.max(map.values());
        int min = Collections.min(map.values());
        char letterUsedMax = ' ';
        char letterUsedMin = ' ';

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> pair : entrySet) {
            if (max == pair.getValue()) {
                letterUsedMax = pair.getKey();
            }
            if (min == pair.getValue()) {
                letterUsedMin = pair.getKey();
            }
        }
        System.out.println("Самая частоиспользуемая буква: " + letterUsedMax);
        System.out.println("Самая редкоиспользуемая буква: " + letterUsedMin);
    }
}
