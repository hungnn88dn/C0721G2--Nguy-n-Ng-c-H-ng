function isPrime(number) {
    var arr = [0, 1];
    for (var i = 2; i < number; i++) {
        arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr;
}
var array = isPrime(10);
var sum = 0;
for (var _i = 0, array_1 = array; _i < array_1.length; _i++) {
    var number = array_1[_i];
    console.log(number);
    sum += number;
}
console.log("Tổng các số nguyên tố trong mảng trên là: " + sum);
