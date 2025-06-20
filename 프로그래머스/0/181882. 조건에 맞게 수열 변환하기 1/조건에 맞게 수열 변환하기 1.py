def solution(arr):
    aa = []
    for i in arr:
        if i >= 50 and i%2==0:
            aa.append(i//2)
        elif i <=50 and i%2==1:
            aa.append(i*2)
        else:
            aa.append(i)
    return aa