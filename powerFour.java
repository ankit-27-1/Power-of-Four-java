class powerFour {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        else if(n%4==0 && isPowerOfFour(n/4)) {
            return true;
        }
        /*
        for(int i=0;i<n;i++){
            if(n==Math.pow(4,i)){
                return true;
            }
        }
        */
        return false;
    }
}
