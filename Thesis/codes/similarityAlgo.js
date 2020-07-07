function similarity(a, b, magB) {
    let [a3,b3] =checkSmaller(a,b)
    let result = innerProd(a3, b3) / (magnitude(a3) * (magnitude(b3)))
    return result
}