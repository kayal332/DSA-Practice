class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Remove non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Step 3: Compare the cleaned string with its reverse
        return cleaned.equals(reversed);
    }
}


