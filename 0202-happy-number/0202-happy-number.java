class Solution {
    public boolean isHappy(int n) {
        Set<Integer>UsedInteger = new HashSet<>();
        while(true){
            int sum = 0;
            while(n!=0){
                int digit = n%10;
                sum += digit*digit;
                n /= 10;
            }
            if(sum == 1){
                return true;
            }
            n = sum;
            if(UsedInteger.contains(n)){
                return false;
            }
            else{
                UsedInteger.add(n);
            }
        }
        
    }
}