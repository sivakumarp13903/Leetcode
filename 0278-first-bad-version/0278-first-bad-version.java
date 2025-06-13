/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1,high=n;
        int mid = low + (high - low) / 2;
        int result=mid;
        while(low<=high){
            if(isBadVersion(mid)){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            mid =  low + (high - low) / 2;
            
        }
        return result;
    }
}