str = input();
length = int(str.split()[0]);
index = int(str.split()[1])-1;
array = [input() for i in range(length)];
array.sort();
print(array[index]);