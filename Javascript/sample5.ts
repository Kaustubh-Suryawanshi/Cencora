//computed enum
enum PrintMedia{
  NewsPaper=1,
  NewsLetter= getMedia('newsletter') as number,
  magzine= NewsLetter*3,
  book =19
}

function getMedia(mediaName: string):number | undefined{
    if(mediaName==='newsletter')
    {
      return 5;
    }
}

console.log(PrintMedia)