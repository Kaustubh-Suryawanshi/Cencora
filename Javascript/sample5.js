var PrintMedia;
(function (PrintMedia) {
    PrintMedia[PrintMedia["NewsPaper"] = 1] = "NewsPaper";
    PrintMedia[PrintMedia["NewsLetter"] = getMedia('newsletter')] = "NewsLetter";
    PrintMedia[PrintMedia["magzine"] = PrintMedia.NewsLetter * 3] = "magzine";
    PrintMedia[PrintMedia["book"] = 19] = "book";
})(PrintMedia || (PrintMedia = {}));
function getMedia(mediaName) {
    if (mediaName === 'newsletter') {
        return 5;
    }
}
console.log(PrintMedia);
