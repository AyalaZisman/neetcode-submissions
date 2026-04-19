

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // מפה: מפתח (חתימת אותיות) → רשימת מילים
        Map<String, List<String>> map = new HashMap<>();

        // עוברים על כל מילה
        for (String word : strs) {

            // מונה של 26 אותיות
            int[] count = new int[26];

            // סופרים כל אות במילה
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';   // הופך אות למספר בין 0–25
                count[index]++;
            }

            // ממירים את המערך למחרוזת שתהיה מפתח
            String key = Arrays.toString(count);

            // אם אין עדיין רשימה עבור המפתח — מוסיפים אחת
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // מוסיפים את המילה לרשימה המתאימה
            map.get(key).add(word);
        }

        // מחזירים את כל הקבוצות
        return new ArrayList<>(map.values());
    }
}
