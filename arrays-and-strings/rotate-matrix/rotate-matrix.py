def rotate_90(matrix):
    n = len(matrix)
    for j in range(n-2):
        for i in range(n-1):
            temp = matrix[n-1-j][i]
            matrix[n-1-j][i] = matrix[j][i]
            matrix[j][i] = temp

            matrix[] 