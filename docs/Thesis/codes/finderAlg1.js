function findActionH(word) {
    clearTable();
    word = decodeURI(word);
    searchQue.value = word
    CreateSerachedWordTable(word);
}