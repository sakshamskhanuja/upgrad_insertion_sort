## Insertion Sort

### Description

There is a total of N students in Professor X’s school for mutants. Each student has a first name as well as a last name, maintained separately in two separate database columns. One day, Professor X asks a student named Logan to copy the items of both these columns in <b>two separate arrays</b> and sort them using <b>insertion sort</b>. However, the <b>first names</b> should be in <b>ascending order</b> and the <b>last names</b> in <b>descending order</b>. Logan never used insertion sort on an array of strings, so he’s seeking for help. Write a function that takes an array of strings as input and returns the sorted array as output. Assume that the names can only be in lowercase.

### Input

1. The first line will be 'n', the size of the two arrays.
2. The next 'n' lines are the first name of the students.
3. The next 'n' lines are the last name of the students.

### Output

1. The first 'n' lines are first names arranged in ascending order.
2. The next 'n' lines are the last names arranged in descending order.

### Sample Input

2<br>
logan<br>
jean<br> 
gray<br> 
wolverine

### Sample Output

jean<br>
logan<br>
wolverine<br>
gray


Here 2 represents the size of the arrays for first and last name. Next 2 lines are first names of 2 students "logan" and "jean". Followed by next 2 inputs of their last names, "gray" and "wolverine". The output has first 2 lines representing first names arranged in ascending order (lexicographically). The next two outputs represent last name of the students arranged in descending order (lexicographically).
