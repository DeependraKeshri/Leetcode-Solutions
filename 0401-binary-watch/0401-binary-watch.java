class Solution {
    HashSet<String> set = new HashSet<>();
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        if (turnedOn > 8) return list;
        helper(turnedOn, 0, 0, 0);
        for (String s : set) {
            list.add(s);
        }
        return list;
    }
    public void helper(int count, int hr, int min, int pos) {
        if (hr > 11 || min > 59) return;
        if (count == 0) {
            String s = hr + ":";
            if (min < 10) s += "0";
            s += min;
            set.add(s);
            return;
        }
        for (int i = pos; i < 10; i++) {
            if (i < 4) {
                helper(count - 1, hr + (1 << i), min, i + 1);
            } else {
                helper(count - 1, hr, min + (1 << (i - 4)), i + 1);
            }
        }
    }
}