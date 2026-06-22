class Solution {
    public int solution(int n) {
        int target = Integer.bitCount(n); // n의 1 비트 개수

        while (true) {
            n++; // n보다 큰 수부터 검사
            if (Integer.bitCount(n) == target) { // 1 개수가 같으면
                return n; // 바로 리턴
            }
        }
    }
}