function ara(){
    dataOku()
    switch(inputData){
        case "b":
            arabic = toArabic(decodeURI(arabic));
            break;
        case "w":
            break;
        case "t":
            break;
        case "r":
            document.title = "R=" + arabic;
            rootToFinder(type + "=" + arabic);
            return;
        default:
            console.log(h, type, arabic, "BROKEN")
            findAction('بسم الله')
            return;
    }
    findActionH(arabic);
}

