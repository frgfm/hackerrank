def array_left_rotation(a, n, k):
    new_arr = [None] * n
    for c in range(n):
        new_arr[(c-k) % n] = a[c]
    return new_arr    

n, k = map(int, input().strip().split(' '))
a = list(map(int, input().strip().split(' ')))
answer = array_left_rotation(a, n, k);
print(*answer, sep=' ')
