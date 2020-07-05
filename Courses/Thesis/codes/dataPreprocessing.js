function dataToArray(t, targetArray) {
    let lines = t.split("\n");
    let suraN;
    console.log("Quran Verses= " + lines.length);
    // temp to hold the number of sura, so we can use it to trigger the next sura and empty the verses array.
    for (let line of lines) {
        line = line.split("|");
        suraN = line[0] - 1;
        if (targetArray[suraN] == undefined) {
            targetArray[suraN] = [];
        }
        targetArray[suraN].push(line[2])
    }
    
}