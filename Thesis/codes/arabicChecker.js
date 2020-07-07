function find(word = "") {
    if (word.length <= 0) return;
    if (isRoot(word)) return;
    if (isLatin(word)) {
        wordLst = nextWordList(word, suraTr)
        return;
    }
    if (/[\u064B-\u0652]/.test(word)) {
        wordLst = nextWordList(word, suraAr);
    } else {
        wordLst = nextWordList(word);
    }
}