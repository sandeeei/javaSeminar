// // /**
// //  * program
// //  */
// // public class program {

// //     public static void main(String[] args) {
// //         int a =123;
// //         a= --a-a--;
// //         System.out.println(a);

// //     }
// // }
// import java.util.Scanner;

// public class program{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in, "cp866");
// System.out.print("Введите имя: ");
// String name = sc.next();

// // .nextLine() --- Считывает строчку
// // .next() --- считывает элемент
// // .nextInt() --- считывает Число

// //12 \n
// // num = 12
// // .... sc.nextLine(); //
// System.out.printf("Привет, %s", name);
// sc.close();

// }
// }


// Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.

// [2 4 1 5 3 3 3 3 3]

// Работать разрешается только с 1 массивом.
import java.util.Arrays;
import java.util.Scanner;

public class program {
public static void main(String[] args) {
int [] arr = new int[]{1,2,3,5,1,3}; // 1 2 4 5 3 3 3 3 3
int val = 3;
int count = 0;//4

for (int i = 0; i < arr.length; i++)
if (arr[i] != val) {
arr[count++] = arr[i];
}

while (count < arr.length)
arr[count++] = val;

// for (int i : arr) {
// System.out.println(i);
// }
System.out.println(Arrays.toString(arr));
}
}
