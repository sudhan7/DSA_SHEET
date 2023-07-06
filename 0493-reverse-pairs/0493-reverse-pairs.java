class Solution {
    int merge(int[] nums,int low,int mid, int high){
        int count=0;
        int j = mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]>(2*(long)nums[j])){
                j++;
            }count+=j-(mid+1);
        }
        ArrayList<Integer>arr=new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                arr.add(nums[left++]);
            }else{
                arr.add(nums[right++]);
            }
        }
        while(left<=mid){
                arr.add(nums[left++]);
            }
        while(right<=high){
                arr.add(nums[right++]);
            }
        for(int i=low;i<=high;i++){
            nums[i]=arr.get(i-low);
        }
        return count;
    }
    public int mergeSort(int []nums,int low,int high){
        if(low>=high){
            return 0;
        }
        int mid=(low+high)/2;
        int inv=mergeSort(nums,low,mid);
        inv+=mergeSort(nums,mid+1,high);
        inv+=merge(nums,low,mid,high);
        return inv;
    }
    public int reversePairs(int[]nums){
        return mergeSort(nums,0,nums.length-1);
    }
}
  


// class Solution {
//     public int reversePairs(int[] nums) {
//         return mergesort(nums,0,nums.length-1);
        
//     }
//     static int mergesort(int arr[],int low, int high){
//         int count = 0;
//         if(low >= high) return count;
//         int mid = (low + high)/2;

//         count += mergesort(arr,low,mid);
//         count += mergesort(arr,mid+1,high);
//         count += countpairs(arr,low,mid,high);
//         merge(arr,low,mid,high);
//         return count;
//     }
//     static int countpairs(int arr[], int low, int mid, int high){
//         int count = 0;
//         int right = mid+1;
//         for(int i=low; i<=mid; i++){
//             while(right <= high && arr[i] > 2*arr[right]) right++;
//             count += (right - (mid+1));
//         }
//         return count;
//     }

//     static void merge(int arr[], int low, int mid, int high){
//         ArrayList<Integer> ans = new ArrayList<>();
//         int left = low;
//         int right = mid+1;
//         while(left <= mid && right <= high){
//             if (arr[left] <= arr[right]){
//                 ans.add(arr[left]);
//                 left++;
//             }
//             else{
//                 ans.add(arr[right]);
//                 right++;
//             }
//         }

//         while(left<=mid){
//             ans.add(arr[left]);
//             left++;
//         }
//         while (right<=high){
//             ans.add(arr[right]);
//             right++;
//         }
//         for(int i=low; i<=high; i++){
//             arr[i] = ans.get(i-low);
//         }


//     }
// }