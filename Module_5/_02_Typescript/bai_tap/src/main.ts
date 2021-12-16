function isFibonacci(number: number): Array<any>[number] {
    let arr:Array<number> = [0,1];
    for(let i= 2; i < number; i++) {
        arr[i]= arr[i -1] + arr[i-2]
    }
    return arr;
}

let array = isFibonacci(10)
let sum = 0;
for (let number of array) {
    console.log(number)
        sum += number;

}
console.log("Tổng các số nguyên tố trong mảng trên là: " + sum);
