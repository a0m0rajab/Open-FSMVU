function tableGenerator(suraAr, surasVector, rootsVector) {
    /** Loop each chapter */
    suraAr.forEach((ayas, indS) => {
        surasVector.set(indS, new Map())
        /**loop each vers in the chapter */
        ayas.forEach(
            (words, indA) => {
                temp = wordsToVector(words);
                             /** Add the counted object to the surasVector map to use later. */
                surasVector.get(indS).set(indA, { vector: temp, aya: words, ch: indS + 1, ver: indA + 1 })
            }
        );
    })
   return surasVector
}