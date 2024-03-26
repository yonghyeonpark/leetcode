class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            List<String> list = result.getOrDefault(key, new ArrayList<>());
            list.add(str);
            result.put(key, list);
        }

        return new ArrayList<>(result.values());
    }
}