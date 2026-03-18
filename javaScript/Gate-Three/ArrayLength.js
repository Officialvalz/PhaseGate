function let [] ArrayLength (let [] FirstSize, let secondSize) {
    let [] Total = new let [secondSize];

    for (let count = 0;   count < secondSize;   count++) {
    
        if (count < FirstSize.length) {
            Total [count] = FirstSize[count];
            
        } else {
            Total [count] = -1;
        }
        
    }
    return Total;
}
    let [] FirstSize = {10, 11, 12};
    let [] putIn = ArrayLength (FirstSize, 5);
    console.log("Numbers:[");
    
    for (let nums : putIn ) {
        console.log(nums + " ");
    }

