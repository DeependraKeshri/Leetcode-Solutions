class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for i in range(len(image)):
            s,e=0,len(image[i])-1
            while(s<=e):
                if(image[i][s]==1 and image[i][e]==1):
                    image[i][s]=0
                    image[i][e]=0
                elif(image[i][s]==0 and image[i][e]==0):
                    image[i][s]=1
                    image[i][e]=1
                s+=1
                e-=1
        return image