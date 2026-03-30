class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        char flag = '#';
        for(String str: strs) {
            int length = str.length();
            encoded = encoded + length + flag + str;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        char flag = '#';
        List<String> decoded = new ArrayList<>();
        // ID string length this is chars prior to # and after start
        // ID start of sequence 
        int i = 0;
        while (i < str.length()) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) != flag) {
                    continue;
                }
                int currSeqLen = Integer.parseInt(str.substring(i,j));
                decoded.add(str.substring(j+1, j + 1 + currSeqLen));
                i = j + 1 + currSeqLen;
                break;
            }
        }
        return decoded;
    }
}
