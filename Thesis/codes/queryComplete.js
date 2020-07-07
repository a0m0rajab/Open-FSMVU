function QueryComplete(){
    let wordlocation = nextWordLoc(word, arr);
    // sugwrd = suggestion word, ns= number sura, na = number aya, wls = world list.
    // anls = aya number list
    let wls = new Set(),
        als = new Set(),
        anls = new Set(),
        lastindex,
        sugwrd, ns, na, aya;
    for (let i = 0; i < wordlocation.length; i++) {
        anls.add([wordlocation[i][0], wordlocation[i][1]])
        ns = wordlocation[i][0];
        na = wordlocation[i][1];
        aya = arr[ns][na];
        lastindex = aya.indexOf(" ", wordlocation[i][2] + 1);
        if (lastindex == -1) {
            lastindex = aya.length;
        }
        sugwrd = aya.substring(wordlocation[i][2], lastindex);
        sugwrd = removePunctions(sugwrd);
        // if end of aya, then check next aya, from the beging
        if (sugwrd.length <= 1) {

            continue;

        }
        // check if aya is out of sura index
        wls.add(sugwrd)
        als.add(aya)
    }

    return [wls, anls];
}
