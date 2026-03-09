class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            int s=0, e=image[i].length-1;
            while(s<=e){
                if(image[i][s]==1 && image[i][e]==1){
                    image[i][s]=0;
                    image[i][e]=0;
                }else if(image[i][s]==0 && image[i][e]==0){
                    image[i][s]=1;
                    image[i][e]=1;
                }
                s++;
                e--;
            }
        }
        return image;
    }
}