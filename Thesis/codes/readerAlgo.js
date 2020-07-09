function appendSura() {
    if (lastSura == 114) return
    addSura(artxt, suraAr[lastSura], lastSura);
    addSura(trtxt, suraTr[lastSura], lastSura);
    setNames(lastSura)
    lastSura++;
    // endOfScroll(artxt, appendSura)
    // checkSuraHeight()
    if (artxt.children.length > 4) {
        removeFirstSura()
    }
}