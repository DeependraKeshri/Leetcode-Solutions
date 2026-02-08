class Solution {
    public String defangIPaddr(String address) {
        String s=address.replace(".","[.]");
        return s;
    }
}