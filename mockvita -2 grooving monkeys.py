n=int(input())
arr=[]
for j in range(n):
    num=int(input())
    arr=list(map(int,input().split()))
    arr.insert(0,0)
    
    arr2=list(range(0,num+1))

    count=0

    orig=arr2
    while True:
        arr3=[0]*(num+1)
        for i in range(1,num+1):
            arr3[arr[i]]=arr2[i]
        count+=1

        if arr3==orig:
            print(count)
            break


        else:
            arr2=arr3





    
