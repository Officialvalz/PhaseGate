let numbers = [
    [100,  3, 150],
    [17,  60,  4],
    [70,  30,  10]
]

let largest = numbers[0][0];
let index =0;
for (let index = 0; index < numbers.length; index++) {
    for (let count = 0; count < numbers[index].length; count++) {
        if (numbers[index][count] > largest) {
            largest = numbers[index][count];
        }
    }
}

console.log("Largest: " + index +"," +"" + largest);
